/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 8/10/2026
 */
package week4;

import java.util.Scanner;

public class DebuggingExample {
    private static int getYear(String input){
        final int index = input.lastIndexOf("/");
        String year = input.substring(index + 1);
        return Integer.parseInt(year);
    }
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the current year");
        int year = in.nextInt();
        System.out.println("Enter your birthday in the form mm/dd/yyyy");
        String input = in.next();
        int birthYear = getYear(input);
        int approxAge = year - birthYear;
        System.out.printf("You are approximately %d years old.", approxAge);
    }
}

