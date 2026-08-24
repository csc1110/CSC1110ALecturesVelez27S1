/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 8/14/2026
 */
package week5;

public class RectangleDriver {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();
        System.out.println("Rectangle r1");
        r1.printValues();
        System.out.println("Rectangle r2");
        r2.printValues();
//        System.out.println("Rectangle1 width and height before are "+
//                r1.getWidth()+" and "+r1.getHeight());
//        System.out.println("Rectangle2 width and height before are "+
//                r2.getWidth()+" and "+r2.getHeight());
        System.out.println();
        System.out.println("Overwriting width and height of r1");
        r1.setWidth(3);
        r1.setHeight(5);
        System.out.println("Rectangle r1");
        r1.printValues();
        System.out.println("Rectangle r2");
        r2.printValues();
//        System.out.println("Rectangle1 width and height after are "+
//                r1.getWidth()+" and "+r1.getHeight());
//        System.out.println("Rectangle2 width and height after are "+
//                r2.getWidth()+" and "+r2.getHeight());
        System.out.println("Perimeter for rectangle r1 is ");
        System.out.println(r1.perimeter());
        System.out.println(r1.getHeight() * 2 + r1.getWidth() * 2);
        System.out.println("Perimeter for rectangle r2 is ");
        System.out.println(r2.perimeter());
        System.out.println(r2.getHeight() * 2 + r2.getWidth() * 2);
    }
}

