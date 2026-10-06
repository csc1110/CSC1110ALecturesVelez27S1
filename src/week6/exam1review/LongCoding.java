/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 10/5/2026
 */
package week6.exam1review;

import java.util.Scanner;

public class LongCoding {
    /**
     * 1.	The code below asks the user for the current military (24hr)
     * time in the form of “hh:mm:ss”. Get the input from the user and print
     * whether it is morning, mid-day, or evening. Morning is the hours 0 to 9,
     * mid-day is 10 to 17, and evening is 18 to 24. You can assume the hours
     * are inclusive, so Morning includes hour 0 and 9.
     */
    public void LC1(){
        Scanner scan = new Scanner(System.in);
        String word;
        System.out.println("Enter the current time " +
                "in the form hh:mm:ss in military time " +
                        "(24 hour format).");
        word = scan.nextLine();
        String hours = word.substring(0,2);
        int val = Integer.parseInt(hours);
        if(val >= 0 && val <= 9){
            System.out.println("Morning");
        } else if(val >= 10 && val <= 17){
            System.out.println("Midday");
        } else{
            System.out.println("Evening");
        }

    }

    /**
     * 2.	Ask the user for their password or ‘q’ to quit. Assume the
     * password is “1234”. If they enter ‘q’ say ‘Quitting’ and end the
     * loop. If they enter the correct password, say ‘Access Granted’
     * and end the loop. If they enter the incorrect password say
     * ‘Access Denied’ and ask again. Do not use break, System.exit(0),
     * or return to prematurely end a loop.
     */
    public void LC2(){
        Scanner scan = new Scanner(System.in);
        String word = "";
        String pass = "1234";

        boolean quit = false;
        //System.out.println("Enter you password of 'q' to quit.");
        //word = scan.nextLine();

        while(!(word.equals(pass) || word.equals("q"))) {
            System.out.println("Enter you password of 'q' to quit.");
            word = scan.nextLine();

            if (word.equals(pass)) {
                System.out.println("Access granted");
            } else if (word.equals("q")) {
                System.out.println("Quitting");
            } else {
                System.out.println("Access denied");
            }
        }

    }

    /**
     * 3.	The code below asks the user for a word. Get the
     * word from the user and create a new String where every
     * lowercase character is replaced with ‘*’. Print the result
     * back to the user. You can use isLowerCase() from the Character
     * Class to check if a character is lowercase. You are not allowed
     * to use the replace() method of the String class.
     */
    public void LC3(){
        Scanner scan = new Scanner(System.in);
        String word;
        System.out.println("Enter a word");
        StringBuilder sb = new StringBuilder();
        word = scan.nextLine();
        for(int i = 0; i < word.length(); i++){
            if(Character.isLowerCase(word.charAt(i))){
                sb.append("*");
            } else {
                sb.append(word.charAt(i));
            }
        }
        System.out.println(sb);


    }

    /**
     * 1.	The code below asks the user for a number.
     * Get the number from the user and print out the
     * factorial of that number. For example, if they
     * entered 5, you would print 120 because 1 * 2 * 3 * 4 * 5 = 120.
     * You can assume the user only enters positive numbers.
     */
    public void EC(){
        Scanner scan = new Scanner(System.in);
        int num;
        System.out.println("Enter a number positive number");
        num = scan.nextInt();
        int fac = 1;
        for(int i = 1; i <= num; i++){
            fac *= i;
        }
        System.out.println(fac);

    }

    static void main() {

    }
}
