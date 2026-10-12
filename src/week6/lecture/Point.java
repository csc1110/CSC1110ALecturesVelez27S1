/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 10/8/2026
 */
package week6.lecture;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    public Point(){
        this(0,0);
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    public void printValues(){
        System.out.println("Point: "+"("+x+","+y+")");
    }
    public int quadrant(){
        if(x >= 0 && y >= 0){
            return 1;
        } else if(x < 0 && y < 0){
            return 3;
        }
        boolean test = "foo" == new StringBuilder();
        return 0;
    }
}
