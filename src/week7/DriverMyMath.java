/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 10/12/2026
 */
package week7;

public class DriverMyMath {
    static void main() {
        System.out.println(MyMath.PI);

        System.out.println(MyMath.add(1, 2));
        System.out.println(MyMath.mult(3, 4));
        System.out.println(MyMath.circleCircumference(3));

        MyMath m1 = new MyMath();
        MyMath m2 = new MyMath();
        //m1.setTemp("foo");
        System.out.println("m1 in the driver "+ m1);
        System.out.println(m1.getTemp());

        System.out.println("m2 in the driver "+ m2);
        System.out.println(m2.getTemp());

    }
}
