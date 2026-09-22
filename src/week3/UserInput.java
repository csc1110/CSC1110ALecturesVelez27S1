/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 9/17/2026
 */
package week3;

import java.util.Scanner;

public class UserInput {
    static void main() {
        Scanner scan = new Scanner(System.in);
        int radius = 0;
        double[] areas = new double[3];
        for(int i = 0; i < 3; i++) {
            System.out.println("Area "+i);
            do {
                System.out.println("Enter a non-negative value for a radius.");
                radius = scan.nextInt();
            } while (radius < 0);

            System.out.println("The radius is " + radius);
            double area = 3.14 * radius * radius;
            System.out.println("The area is " + area);
            areas[i] = area;
        }

        //System.out.println("Enter a non-negative value for a radius.");
        //radius = scan.nextInt();
//        radius = -1;
//        while(radius < 0){
//            System.out.println("Enter a non-negative value for a radius.");
//            radius = scan.nextInt();
//        }
    }
}
