/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 9/21/2026
 */
package week4;

import java.util.Scanner;

public class MathExamples {
    static void main() {
        int x = -5;
        Scanner scanner = new Scanner(System.in);
        scanner.next();
        System.out.println("Absolute value of "+x+
                " is "+Math.abs(x));
        System.out.println("Square root of x is "+Math.sqrt(x));
        System.out.println("Min of x and 10 is "+Math.min(x, 10));
        System.out.println("Max of x and 10 is "+Math.max(x, 10));
        System.out.println("X square is "+Math.pow(x, 2));

        System.out.println("Log of 1000 "+Math.log10(1000));
        System.out.println("2 raised to "+Math.log(64)/Math.log(2));

        double y = 1.999;
        System.out.println("Round is "+Math.round(y));
        System.out.println("Floor is "+Math.floor(y));
        System.out.println("Ceil is "+Math.ceil(y));
        for(int i = 0; i < 10; i++) {
            System.out.println("Random number from 0 up to 1 " + ((int) (Math.random() * 10) + 1));
        }

        int radius = 9;
        double area = Math.PI * Math.pow(radius,2);
        int degrees = 180;
        System.out.println("Degrees "+degrees+" is radians is " +
        Math.toRadians(degrees));
        System.out.println("Radians "+Math.PI+" is degress is " +
                Math.toDegrees(Math.PI));

        System.out.println("Angle of a right 5 5 triangle is");
        System.out.println(Math.toDegrees(Math.atan(5/5)));



    }
}
