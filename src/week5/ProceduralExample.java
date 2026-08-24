/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 8/14/2026
 */
package week5;

import java.util.Scanner;

public class ProceduralExample {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        double radius1;
        double radius2;
        String color1;
        String color2;

        System.out.println("Enter a radius for circle 1");
        radius1 = scanner.nextDouble();
        System.out.println("Enter the color for circle 1");
        color1 = scanner.next();

        System.out.println("Radius of the circle is " + radius1);
        System.out.println("Color of the circle is "+color1);
        System.out.println("Area of the circle is "+Math.PI * Math.pow(radius1, 2));

        System.out.println("Enter a radius for circle 2");
        radius2 = scanner.nextDouble();
        System.out.println("Enter the color for circle 2");
        color2 = scanner.next();

        System.out.println("Radius of the circle is " + radius2);
        System.out.println("Color of the circle is "+color2);
        System.out.println("Area of the circle is "+Math.PI * Math.pow(radius2, 2));
    }
}
