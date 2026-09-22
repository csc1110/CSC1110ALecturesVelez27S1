/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 9/17/2026
 */
package week3;

import java.util.Scanner;

public class InputValidation {
    static void main() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a whole number.");
        while(!scan.hasNextInt()){
            //clear out System.in.
            scan.nextLine();
            //ask again
            System.out.println("Error, try again to enter a whole number.");
        }
        int num = scan.nextInt();
        System.out.println("The int plus 1 is "+(num + 1));
    }
}
