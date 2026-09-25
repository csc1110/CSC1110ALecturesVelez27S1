/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 9/22/2026
 */
package week4;

public class CircleDriver {
    private static double GREATEST_DIAMETER = 10;
//    private static void temp(){
//        System.out.println(GREATEST_DIAMETER);
//        System.out.println(greatestDiameter);
//    }
    static void main() {
        final int greatestDiameter = 10;
        System.out.println(GREATEST_DIAMETER);
        Circle c1 = new Circle();
        Circle c2 = new Circle();

        System.out.println("Area is "+c1.area());
        System.out.println("Circumference is "+c1.circumference());

        System.out.println("Circle 1");
        c1.printValues();
        System.out.println("Circle 2");
        c2.printValues();

        System.out.println("Modifying c1");
        c1.setDiameter(greatestDiameter);
        c1.setColor("red");
        c1.printValues("Circle 1");
        c2.printValues("Circle 2");
    }
}
