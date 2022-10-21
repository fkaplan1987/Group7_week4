package Eugene;

public class FrequencyOfCharacters {
     /*
    String -- Frequency of Characters
    Write a return method that can find the frequency of characters
    Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */

    public static String frequencyOfCharacters(String str) {

        int count;
        String str1;
        String result = "";

        for (int i = 0; i < str.length() - 1; i++) {
            count = 0;
            str1 = "";
            for (int k = 0; k < str.length(); k++) {
                if (str.charAt(i) == str.charAt(k)) {
                    count++;
                }
            }
            str1 += "" + str.charAt(i) + count;
            if (!result.contains(str1)) {
                result += str1;
            }
        }
        return result;
    }
}
