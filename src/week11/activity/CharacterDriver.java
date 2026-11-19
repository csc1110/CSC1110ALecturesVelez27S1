/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 11/11/2026
 */
package week11.activity;

import java.util.Scanner;

public class CharacterDriver {
    static void main() {
        Character character = new Character("walk");
        Scanner scan = new Scanner(System.in);
        boolean quit = false;
        do{
            System.out.println("Current movement mode: "+character.getMoveMode());
            System.out.println("What would you like to do?");
            System.out.println("""
                    1. Move
                    2. Change to walk.
                    3. Change to sneak.
                    4. Change to run.
                    5. Quit
                    """);
            String input = scan.next();
            switch (input) {
                case "1" -> character.move();
                case "2" -> character.setMoveMode("walk");
                case "3" -> character.setMoveMode("sneak");
                case "4" -> character.setMoveMode("run");
                case "5" -> {
                    System.out.println("Quitting");
                    quit = true;
                }
                default -> System.out.println("Invalid input.");
            }
        } while (!quit);
    }
}
