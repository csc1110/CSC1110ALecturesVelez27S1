/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 11/10/2026
 */
package week10.prep;

import java.util.Scanner;

public class AnimalSounds {
    private static void playSound(String animal){
        switch (animal) {
            case "cat" -> System.out.println("Meow");
            case "dog" -> System.out.println("Woof");
            case "cow" -> System.out.println("Moo");
        }
    }
    static void main() {
        System.out.println("What animal sound would you like to play?");
        System.out.println("""
                1. Cat
                2. Dog
                3. Cow
                """);
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        switch (input) {
            case 1 -> playSound("cat");
            case 2 -> playSound("dog");
            case 3 -> playSound("cow");
            default -> System.out.println("Invalid options");
        }
    }
}
