/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 8/14/2026
 */
package week5;

public class CircleDriver {
    static void main() {
        Circle c1 = new Circle();
        Circle c2 = new Circle();
        System.out.println("Circle 1");
        c1.printValues();
        System.out.println("Circle 2");
        c2.printValues();
//        System.out.println("Circle 1 diameter and color are "+
//                c1.getDiameter() + " and "+c1.getColor());
//        System.out.println("Circle 2 diameter and color are "+
//                c2.getDiameter() + " and "+c2.getColor());

        System.out.println("Modifying diameter and color of Circle 1.");
        c1.setDiameter(3);
        c1.setColor("blue");

        //System.out.println("Circle 1");
        c1.printValues("Circle 1");
        //System.out.println("Circle 2");
        c2.printValues("Circle 2");
//
//        System.out.println("Circle 1 diameter and color are "+
//                c1.getDiameter() + " and "+c1.getColor());
//        System.out.println("Circle 2 diameter and color are "+
//                c2.getDiameter() + " and "+c2.getColor());

//        double radius = c1.getDiameter() / 2;
//        double area = Math.PI * Math.pow(2, radius);
//        double circumference = radius * 2 * Math.PI;
        System.out.println("Area and circumference of Circle 1");
//        System.out.println("Area: " + area);
//        System.out.println("Circumference: "+circumference);
        System.out.println("Area: " + c1.area());
        System.out.println("Circumference: "+c1.circumference());


//        double radius2 = c2.getDiameter() / 2;
//        double area2 = Math.PI * Math.pow(2, radius2);
//        double circumference2 = radius2 * 2 * Math.PI;
        System.out.println("Area and circumference of Circle 2");
//        System.out.println("Area: " + area2);
//        System.out.println("Circumference: "+circumference2);
        System.out.println("Area: " + c2.area());
        System.out.println("Circumference: "+c2.circumference());


    }
}
