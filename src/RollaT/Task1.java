package RollaT;

import java.util.Scanner;

public class Task1 {
    //created task one
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the  string is: ");
        String str = sc.nextLine();
        int[] freq = new int[str.length()];

        char str1[] = str.toCharArray();
        for(int i = 0; i <str.length(); i++)
        {
            freq[i] = 1;
            for(int j = i+1; j <str.length(); j++)
            {
                if(str1[i] == str1[j])
                {
                    freq[i]++;


                    str1[j] = '0';
                }
            }
        }
        //Displays the characters and their corresponding frequency
        System.out.println("Frequencies of the characters in the string are as below: ");
        System.out.println("Characters  frequencies");
        for(int i = 0; i <freq.length; i++)
        {
            if(str1[i] != ' ' && str1[i] != '0')
                System.out.println(str1[i] + "              " + freq[i]);
        }
    }
}





