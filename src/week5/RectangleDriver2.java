/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 9/30/2026
 */
package week5;

public class RectangleDriver2 {
    static void main() {
//        Create a new instance of a Rectangle,
//        set the width and height to 3 and 4 respectively,
//        and print out whether it is square or not using
//        the isSquare() method.
        Rectangle r1 = new Rectangle();
        r1.setWidth(3);
        r1.setHeight(4);
        if(r1.isSquare()){
            System.out.println("In a square");
        } else {
            System.out.println("Is not a square");
        }
    }
}
