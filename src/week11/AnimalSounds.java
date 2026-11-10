/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 11/10/2026
 */
package week11;

import java.util.Scanner;

public class AnimalSounds {
    private static void playSounds(String animal){
        switch (animal) {
            case "cat" -> System.out.println("Meow");
            case "dog" -> System.out.println("Woof");
            default -> System.out.println("Invalid");
        }
    }
    private static void playSoundsInterface(Animal animal){
        animal.makeNoise();
    }
    static void main() {
        System.out.println("What animal sound " +
                "would you like to play?");
        System.out.println("""
                1. Cat
                2. Dog
                """);
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        switch (input) {
            case 1 -> playSoundsInterface(new Cat());
            case 2 -> playSoundsInterface(new Dog());
            default -> System.out.println("Invalid");
        }
        switch (input) {
            case 1 -> playSounds("cat");
            case 2 -> playSounds("dog");
            default -> System.out.println("Invalid");
        }
    }
}
