/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 10/5/2026
 */
package week6.lecture;

public class RectangleDriver {
    static void main() {
        Rectangle r1 = new Rectangle(7);
        Rectangle r2 = new Rectangle(6, 7, "R2");
        Rectangle r3 = new Rectangle();
        System.out.println(r1.toString());

        System.out.println("Width is "+r1.getWidth());
        System.out.println("Length is "+r1.getLength());
        System.out.println("ID is "+r1.getId());

        System.out.println("Width is "+r2.getWidth());
        System.out.println("Length is "+r2.getLength());
        System.out.println("ID is "+r2.getId());

//        r1.setWidth(3);
//        r1.setLength(4);
//
//        System.out.println("Width is "+r1.getWidth());
//        System.out.println("Length is "+r1.getLength());
    }
}
