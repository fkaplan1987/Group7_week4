package Eugene;

import java.util.Arrays;

public class SameLetters {
    /*
    String -- Same letters
    Write a return method that check if a string is build out of the same letters as another string.
    Ex: same("abc", "cab"); -> true
    same("abc", "abb"); -> false:
     */

    public static boolean sameLetters(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        String[] arr1 = str1.split("");
        String[] arr2 = str2.split("");

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }
}
