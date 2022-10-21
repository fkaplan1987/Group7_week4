package Eugene;

public class RemoveDuplicates {
    /*
    String -- Remove Duplicates
    Write a return method that can remove the duplicated values from String
    Ex: removeDup("AAABBBCCC") ==> ABC
     */

    public static String removeDuplicates(String str) {

        String result = "";

        for (int k = 0; k < str.length(); k++) {
            if (!result.contains("" + str.charAt(k))) {
                result += "" + str.charAt(k);
            }
        }
        return result;
    }
}
