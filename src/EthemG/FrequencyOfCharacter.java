package MentorPractice;

import jdk.jfr.Frequency;

import javax.xml.stream.events.Characters;

public class FrequencyOfCharacter {
    //    Write a return method that can find the frequency of
    //            characters
    //    Ex:
    //    FrequencyOfChars ("AAABBCDD") ==> A3B2C1D2
    public static int frequencyOfCharacters(String str, char letter) {
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == letter) {
                counter++;
            }
        }


        return counter;
    }

    public static void main(String[] args) {
        String str= "AAABBCDD";
        System.out.print("A"+frequencyOfCharacters(str,'A' )+"B"+frequencyOfCharacters(str, 'B')+"C"+frequencyOfCharacters(str, 'C')+"D"+frequencyOfCharacters(str, 'D'));

    }
}
