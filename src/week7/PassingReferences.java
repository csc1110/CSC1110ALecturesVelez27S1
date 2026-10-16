/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 10/16/2026
 */
package week7;

public class PassingReferences {
    private static void modifyCircle1(Circle circle){
        circle.setRadius(42);
    }
    private static Circle modifyCircle2(Circle circle){
        circle.setRadius(42);;
        return circle;
    }
    private static Circle modifyCircle3(Circle circle){
        Circle ret = new Circle(circle.getRadius(), circle.getId());
        ret.setRadius(42);;
        return ret;
    }
    static void main() {
        Circle c1 = new Circle(3, "c1");
        Circle c2 = c1;

        System.out.println("Before");
        System.out.println("C1 is "+c1);
        System.out.println("C2 is "+c2);

        System.out.println("Modifying c1 ");
        modifyCircle1(c1);
        System.out.println("C1 is "+c1);
        System.out.println("C2 is "+c2);


        Circle c3 = modifyCircle2(c1);
        System.out.println("Before");
        System.out.println("C1 is "+c1);
        System.out.println("C2 is "+c2);
        System.out.println("C3 is "+c3);

        System.out.println("Modifying c1");
        c1.setRadius(67);
        System.out.println("C1 is "+c1);
        System.out.println("C2 is "+c2);
        System.out.println("C3 is "+c3);

        Circle c4 = modifyCircle3(c1);
        System.out.println("Before");
        System.out.println("C1 is "+c1);
        System.out.println("C2 is "+c2);
        System.out.println("C3 is "+c3);
        System.out.println("C4 is "+c4);

        System.out.println("Modifying c1");
        c1.setRadius(100);
        System.out.println("C1 is "+c1);
        System.out.println("C2 is "+c2);
        System.out.println("C3 is "+c3);
        System.out.println("C4 is "+c4);






    }
}
