/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 10/16/2026
 */
package week8.slides;

import java.util.Scanner;

public class StringDriver {
    static void main() {
        Scanner scan = new Scanner(System.in);
        String[] words;
        System.out.println("How many words do you want to enter?");
        int numWords = scan.nextInt();
        words = new String[numWords];
        int sum = 0;
        for(int i = 0; i<words.length; i++){
            System.out.println("Enter a word to put in the array");
            words[i] = scan.next();
            sum += words[i].length();
        }
        double avg = (double) sum / words.length;
        int wordsBelow = 0;
        for(int i = 0; i<words.length; i++){
            if(words[i].length() < avg){
                wordsBelow++;
            }
        }
        String[] smallWords = new String[wordsBelow];
        String[] notSmallWords = new String[words.length - wordsBelow];

        for(int i = 0; i < smallWords.length; i++){

        }

    }
}
