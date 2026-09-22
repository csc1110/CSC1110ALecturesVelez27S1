/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 9/17/2026
 */
package week3;

import java.util.Scanner;

public class PasswordExample {
    static void main() {
        Scanner scan = new Scanner(System.in);
        String password = "1234";
        String guess;
        do {
            System.out.println("Enter your password or" +
                    "enter 'q' to quit.");
            guess = scan.next();
            if (guess.equals(password)) {
                System.out.println("Access granted");
            } else if(guess.equals("q")){
                System.out.println("Quitting");
                //break;
                //continue;
                //return;
                //System.exit(0)
            } else {
                System.out.println("Access denied");
            }
        } while(!guess.equals(password) && !guess.equals("q"));

    }
}
