package RollaT;

import java.util.LinkedHashSet;

public class Task3 {
    //Created third task
    //Remove Duplicates
    static void removeDuplicates(String str)
    {

        LinkedHashSet<Character> set = new LinkedHashSet<>();

        for(int i=0;i<str.length();i++)
            set.add(str.charAt(i));


        for(Character ch : set)
            System.out.print(ch);
    }


    public static void main(String args[])
    {

        String str = "aaaabbbbccccdddd";

        removeDuplicates(str);
    }
}

