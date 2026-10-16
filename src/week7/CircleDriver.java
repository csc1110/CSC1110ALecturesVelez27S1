/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 10/12/2026
 */
package week7;

public class CircleDriver {
    static void main() {
        System.out.println("Should be 0 " + Circle.count);
        Circle c1 = new Circle(3, "c1");
        System.out.println("Should be 1 " + Circle.count);
        Circle c2 = new Circle(3, "c1");
        System.out.println("Should be 2 " + Circle.count);
        Circle c3 = new Circle(3, "c1");
        System.out.println("Should be 3 " + Circle.count);

        System.out.println(c1.count);
        System.out.println(c2.count);
        System.out.println(c3.count);
        System.out.println(Circle.count);
    }
}
