/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 10/13/2026
 */
package week7.tracing;

public class Square {
    private int side;
    private String id;
    public void setSide(int side) {
        this.side = side;
    }
    public void setID(String id) {
        this.id = id;
    }
    public int getSide() {
        return side;
    }
    public String getID() {
        return id;
    }
    public void disp() {
        System.out.println("Square " + id + " width side " + side);
    }
    public double area() {
        double ret = side * side;
        return ret;
    }
    public boolean smallerThan(Square that) {
        double thisArea = this.area();
        double thatArea = that.area();
        boolean ret = thisArea < thatArea;
        return ret;
    }
}
