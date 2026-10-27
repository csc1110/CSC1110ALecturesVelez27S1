/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 10/19/2026
 */
package week8;

public class SquareDriver {
    static void main() {
        int[] nums = new int[10];
//        Create an array of size 10 of Squares
        Square[] squares = new Square[10];
//        Fill the array with Squares with random side lengths
//        ranging from 1 to 10
        squares[0] = new Square(3);
        Square s = new Square(42);
        squares[1] = s;
        for(int i = 0; i < 10; i++){
            int side = (int)(Math.random() * 10) + 1;
            squares[i] = new Square(side);
        }
        double sum = 0;
        for(int i = 0; i < squares.length; i++){
            Square s1 = squares[i];
            sum += s1.area();
        }
//        double avg = sum / squares.length;
//        int numLess = 0;
//        for(int i = 0; i < squares.length; i++){
//            if(squares[i].area() >k avg){
//                numLess++;
//            }
//        }
//        Find the average area and then print out how many
//        squares have an above average area
//        Find the square with the max area and its index

//        Use biggerThan() to compare the square at the middle of
//        the list, with the square at the end of the list
        boolean result = squares[squares.length/2].
                biggerThan(squares[squares.length - 1]);

    }
}
