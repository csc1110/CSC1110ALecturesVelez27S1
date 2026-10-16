/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 10/13/2026
 */
package week7;

public class MemoryAndReferences {
    static void main() {
//        int x = 10;
//        int y = 11;
//        int z = x;
//
//        System.out.println("x is "+x);
//        System.out.println("y is "+y);
//        System.out.println("z is "+z);
//        x = 4;
//        System.out.println("x is "+x);
//        System.out.println("y is "+y);
//        System.out.println("z is "+z);
        Circle c1 = new Circle(3, "c1");
        Circle c2 = new Circle(4, "c2");
        Circle c3 = c1;

        System.out.println("C1 is "+c1);
        System.out.println("C2 is "+c2);
        System.out.println("C3 is "+c3);
        c1.setRadius(42);

        System.out.println("C1 is "+c1);
        System.out.println("C2 is "+c2);
        System.out.println("C3 is "+c3);
//        //What does == compare for?
//        int r = 4;
//        System.out.println(x == z);
//        System.out.println(x == r);
//        System.out.println(c1 == c2); //false
//        System.out.println(c1 == c3); //true

    }
}
