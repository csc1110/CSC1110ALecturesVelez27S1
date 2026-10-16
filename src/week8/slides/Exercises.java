/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 10/16/2026
 */
package week8.slides;

import java.util.Scanner;

public class Exercises {
    public void basic2() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a length for the array");
        int arrayLen = scan.nextInt();

        int[] list = new int[arrayLen];
        for (int i = 0; i < list.length; i++) {
            System.out.println("Enter a number");
            list[i] = scan.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < list.length; i++) {
            sum += list[i];
        }
        System.out.println("sum is " + sum);
        System.out.println("mean is " + sum / (double) list.length);

        int min = list[0];
        int max = list[0];
        for (int i = 0; i < list.length; i++) {
            if (list[i] > max) {
                max = list[i];
            }
            if (list[i] < min) {
                min = list[i];
            }
        }
        System.out.println("Min is " + min);
        System.out.println("Max is " + max);
    }
}
