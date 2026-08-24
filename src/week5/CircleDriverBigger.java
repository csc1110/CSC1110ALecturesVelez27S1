/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 8/14/2026
 */
package week5;

public class CircleDriverBigger {
    static void main() {
        Circle c1 = new Circle();
        Circle c2 = new Circle();
        c1.setDiameter(5);
        c2.setDiameter(10);
        c1.printValues("1");
        c2.printValues("2");

        System.out.println("Is c1 bigger than c2 " +
                (c1.area() > c2.area()));
        System.out.println("Is c2 bigger than c1 " +
                (c2.area() > c1.area()));

        System.out.println("Is c1 bigger than c2 "+c1.biggerThan(c2));
        System.out.println("Is c2 bigger than c1 "+c2.biggerThan(c1));
    }
}
