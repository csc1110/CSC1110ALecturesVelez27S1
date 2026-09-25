/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 9/24/2026
 */
package week4;

public class CircleDriveThis {
    static void main() {
        Circle c1 = new Circle();
        Circle c2 = new Circle();
        System.out.println("Before " + c1.getDiameter());
        c1.setDiameter(42);
        c2.setDiameter(100);

        System.out.println("c1 is "+c1.toString());
        //After this point, the diameter of c1 is 42
        c1.testMethod(67);
        System.out.println("c2 is "+c2);
        c2.testMethod(-9);

        System.out.println("After " + c1.getDiameter());
    }
}
