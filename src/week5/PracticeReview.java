/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 9/30/2026
 */
package week5;

import java.util.Scanner;

public class PracticeReview {
    private static void LC1(){
//        The code below asks the user for the current
//        date in the form of “dd/mm/yyyy”. Get the input
//        from the user and print back if it is Spring,
//        Summer, Fall, or Winter. You can assume Spring
//        is the months 3 to 5, Summer is 6 to 8, Fall is
//        9 to 11, and Winter is the remaining months. The
//        months listed are inclusive. For example, Spring
//        would be months 3, 4, or 5.

        Scanner scan = new Scanner(System.in);
        String date;
        System.out.println("Enter the date in the form dd/mm/yyyy");
        date = scan.nextLine();
        String m = date.substring(3,5);
        int monthNum = Integer.parseInt(m);

        if(monthNum == 3 || monthNum == 4 || monthNum == 5){
            System.out.println("Spring");
        } else if(monthNum >= 6 && monthNum <= 8){
            System.out.println("Summer");
        } else if(monthNum >= 9 && monthNum <= 11){
            System.out.println("Fall");
        } else {
            System.out.println("Winter");
        }
    }

    private static void LC2(){
//        Ask the user to enter a positive number between 5 and 20
//        or -1 to quit. If they enter -1 say ‘Quitting’ and end the
//        loop. If they enter a valid number, say ‘Correct’ and end
//        the loop. If they enter an invalid number, say ‘Incorrect’
//        and ask again. Assume the driver class is already made and
//        all imports have been done for you.

        Scanner scan = new Scanner(System.in);
        int val;
        do {


            System.out.println("Enter a positive number between 5 and 20 " +
                    "or -1 to quit");
            val = scan.nextInt();
            if(val >= 5 && val <= 20){
                System.out.println("Correct");
            } else if(val == -1){
                System.out.println("quitting");
            } else {
                System.out.println("Incorrect");
            }
        } while (val != -1 && (val >= 5 && val <= 20));


    }

    private static void LC3(){
//        Ask the user for a word and a target letter.
//        Print out the index of the first occurrence of
//        that letter. If the letter does not exist in
//        the word, print out -1. You are not allowed to
//        use the methods contains(), replace(), indexOf(),
//        or lastIndexOf(). Do not use break, System.exit(),
//        or return to terminate a loop.

        Scanner scan = new Scanner(System.in);
        String word;
        String target;
        System.out.println("Enter a word.");
        System.out.println("Enter a target letter");
        word = scan.nextLine();
        target = scan.nextLine();
        int index = -1;
        int count = 0;
        while(index == -1 && count < word.length()){
            if(word.charAt(count) == target.charAt(0)){
                index = count;
            }
            count++;
        }
        for(int i = 0; i < word.length() && index == -1; i++) {
            if (word.charAt(i) == target.charAt(0)) {
                index = i;
            }
        }
//            if(word.substring(i, i + 1).equals(target)){
//
//            }


        //System.out.println("index is "+index);

    }
    private static void EC(){
//        (5 points) Ask the user for a word. Print out
//        the letters at indices that are even. For example,
//        if the word was “cat”, you would print out the ‘c’
//        and the ‘t’ because they are at index 0 and 2.
//        If the word was “taco”, you would print out the
//        ‘t’ and ‘c’. Hint, if the modulus (%) of a number and
//        2 is 0, then that number is even.

        Scanner scan = new Scanner(System.in);
        String word;
        System.out.println("Enter a word.");
        word = scan.next();
        for(int i = 0; i<word.length(); i++) {
            if (i % 2 == 0) {
                System.out.print(word.charAt(i) + " ");
            }
        }

    }
    static void main() {

    }
}
