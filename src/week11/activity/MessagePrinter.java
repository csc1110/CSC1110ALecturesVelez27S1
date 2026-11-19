/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 11/11/2026
 */
package week11.activity;

import java.util.Scanner;

public class MessagePrinter {
    private static void printMessage(String msg, String format){
        switch (format) {
            case "upper" -> System.out.println(msg.toUpperCase());
            case "reverse" -> System.out.println(new StringBuilder(msg).reverse());
            default -> System.out.println("Invalid option");
        }
    }

    static void main() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a message");
        String msg = scan.next();
        System.out.println("Enter how you would like it displayed.");
        System.out.println("""
                1. All uppercase.
                2. Backwards
                """);
        int input = scan.nextInt();
        switch (input) {
            case 1 -> printMessage(msg, "upper");
            case 2 -> printMessage(msg, "reverse");
            default -> System.out.println("Invalid option.");
        }
    }
}

