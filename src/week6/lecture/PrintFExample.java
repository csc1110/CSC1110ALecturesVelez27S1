/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 10/7/2026
 */
package week6.lecture;

public class PrintFExample {
    static void main() {
        String word = "taco";

        System.out.print("|");
        System.out.printf("%-5s", word);
        System.out.print("|");
        System.out.println();

        System.out.print("|");
        System.out.printf("%-10s", word);
        System.out.print("|");
        System.out.println();

        System.out.print("|");
        int x = 15;
        System.out.printf("%-"+x+"s", word);
        System.out.print("|");
        System.out.println();

        System.out.print("|");
        System.out.printf("%-20s", word);
        System.out.print("|");
        System.out.println();
    }
}
