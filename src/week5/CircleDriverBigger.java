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
        c1.setDiameter(15);
        c2.setDiameter(10);
        c1.printValues("1");
        c2.printValues("2");

//        System.out.println("C1 is "+c1);
//        System.out.println("C2 is "+c2);
//
//        System.out.println("Calling bt on c1 " +
//                "and passing in c2");
//        c1.biggerThan(c2);
//        System.out.println("Calling bt on c2 " +
//                "and passing in c1");
//        c2.biggerThan(c1);


        if(c1.biggerThan(c2)){
            System.out.println("C1 is bigger");
        } else {
            System.out.println("C2 is bigger");
        }
        if(c2.biggerThan(c1)){
            System.out.println("C2 is bigger");
        } else {
            System.out.println("C1 is bigger");
        }

    }
}
