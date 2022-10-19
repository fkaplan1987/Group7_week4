package package1;

public class EcaterinaTask {

/*
    String -- Frequency of Characters
    Write a return method that can find the frequency of characters
    Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */

    public static String frequencyOfChar(String str) {


        String result = "";
        String[] temp = str.split("");

        for (int i = 0; i < temp.length; i++) {
            int count = 0;
            String s = "";
            for (int j = 0; j < temp.length; j++) {
                if (temp[i].equals(temp[j])) {
                    count++;
                }
            }
            s += temp[i] + count;
            if(!result.contains(s))
                result += s;
        }
        return result;
    }

    public static void main (String[]args){
        System.out.println(frequencyOfChar("AAABBCDD"));
    }
}

