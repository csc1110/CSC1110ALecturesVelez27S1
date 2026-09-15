/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 9/15/2026
 */
package week3;


import java.util.Scanner;

public class StringEquals {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you password.");
        String guess;
        String password = "1234";
        // guess = scanner.next();
        //guess = new String("1234");
        guess = "1234";

        if(!password.equals(guess)){
            System.out.println("Access denied");
        } //else {
        //System.out.println("Access denied!!!");
        //}
        int x = 5;
        int y = 10;
        if(x == y){
            System.out.println("X and Y are the same.");
        } else {
            System.out.println("X and Y are not the same.");
        }


    }
}
