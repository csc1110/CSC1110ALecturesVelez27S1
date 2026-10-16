/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 10/16/2026
 */
package week8.slides;

public class Square {
    private int side;
    public Square(int side) {
        this.side = side;
    }
    public int getSide() {
        return side;
    }
    public void setSide(int side) {
        this.side = side;
    }
    public int area(){
        return side * side;
    }
    public boolean biggerThan(Square that){
        return this.area() > that.area();
    }
}
