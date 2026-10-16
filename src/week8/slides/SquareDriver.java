/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 10/16/2026
 */
package week8.slides;

public class SquareDriver {
    static void main() {
        final int squareArraySize = 10;
        Square[] squares = new Square[squareArraySize];
        for(int i = 0; i<squares.length; i++){
            int s = (int)(Math.random() * 10) + 1;
            squares[i] = new Square(s);
        }
        for(int i = 0; i<squares.length; i++){
            System.out.println("Square "+i+" area: "+squares[i].area());
        }
        int sum = 0;
        for(int i = 0; i<squares.length; i++){
            sum += squares[i].area();
        }
        double avg = (double) sum/squares.length;
        int aboveAverage = 0;
        for(int i = 0; i<squares.length; i++){
            if(squares[i].area() > avg){
                aboveAverage++;
            }
        }
        System.out.println("There are "+aboveAverage+" squares with an area above "+avg);
        int max = squares[0].area();
        int index = 0;
        for(int i = 1; i<squares.length; i++) {
            if (squares[i].area() > max) {
                max = squares[i].area();
                index = i;
            }
        }
        System.out.println("Max area is "+max+" at index "+index);

        System.out.println("Is the square at index "+squares.length/2+
                " index bigger than the square at index "+(squares.length - 1));
        System.out.println(squares[squares.length/2].biggerThan(squares[squares.length - 1]));
    }
}
