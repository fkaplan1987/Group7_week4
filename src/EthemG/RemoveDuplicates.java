package MentorPractice;

public class RemoveDuplicates {
//    String Remove Duplicates
//    Write a return method that can remove the duplicated values from String
//    Ex: removeDup (" AAABBBCCC")==> ABC
    public static String removeDuplicates(String str){

        String charcter= "";
        String duplicate= "";
        for (int i = 0; i < str.length(); i++) {
            if (charcter.contains(""+str.charAt(i))){
                if (!duplicate.contains(""+str.charAt(i))){
                    duplicate+= str.charAt(i);
                }
            }
            charcter+=str.charAt(i);
        }
return duplicate;

    }
    public static void main(String[] args) {
        System.out.println("Input: (\"AAABBBCCC\") = " + RemoveDuplicates.removeDuplicates("AAABBBCCC"));
    }
}
