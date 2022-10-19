package MentorPractice;

public class SameLetters {
    //    String Same letters
//    Write a return method that check if a string is build out of the same letters as another string.
//            Ex: same("abc","cab"); --> true
//                same("abc", "abb "); --> false
    public static boolean sameLetter(String str1, String str2) {
        String str = str1;
        int count = 0;
        boolean result = true;
        for(int i=0 ; i<str2.length() ; i++){
            char c = str2.charAt(i);
            if(str.contains(String.valueOf(c))){
                str = str.replaceFirst(String.valueOf(c), "");
                count++;
            }
        }
        if (count == str2.length()){
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    public static void main(String[] args) {
        String str1 = "boomerang";
        String str2 = "moobrang";
        System.out.println("Same " + sameLetter(str1, str2));

    }
}
