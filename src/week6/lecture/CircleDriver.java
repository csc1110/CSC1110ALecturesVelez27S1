/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 10/8/2026
 */
package week6.lecture;

import week6.Circle;

public class CircleDriver {
    static void main() {

        int a[] = new int[10];

        Circle c1 = new Circle(5, "red", 3, 2);
        System.out.println(c1.display());
        Circle c2 = new Circle(-2, "blue", 1, 1);
        System.out.println(c2.display());

        System.out.println(c1.hit(5,3));
        System.out.println(c1.hit(10,10));


    }
}
