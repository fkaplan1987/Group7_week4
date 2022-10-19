package RollaT;

import java.util.Arrays;

public class Task2 {
    //created task 2

    String str = "Follow";
    String str1 = "Hollow";

    public void compare() {
        char[] firstString = str.toLowerCase().toCharArray();
        char[] secondString = str1.toLowerCase().toCharArray();

        Arrays.sort(firstString);
        Arrays.sort(secondString);

        if (Arrays.equals(firstString, secondString) == true) {
            System.out.println("Both the string contain same character");
        } else {
            System.out.println("Both the string contains different character");
        }
    }

    public static void main(String[] args) {
        Task2 compareString = new Task2();
        compareString.compare();
    }
}