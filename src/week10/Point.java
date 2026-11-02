/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 11/2/2026
 */
package week10;

public class Point {
    //private int x;
    //private int y;
    //store coordinates in an array of ints called coordinates
    private int[] coordinates;

    public Point(int x, int y){
        coordinates = new int[2];
        coordinates[0] = x;
        coordinates[1] = y;
    }
    public Point(){
        this(0,0);
    }
    public double dist(Point point){
        int x1 = point.coordinates[0];
        int y1 = point.coordinates[1];
        return Math.sqrt(Math.pow(x1 - coordinates[0], 2) +
                Math.pow(y1 - coordinates[1],2));
    }
    public void move(int dx, int dy){
        this.coordinates[0] += dx;
        this.coordinates[1] += dy;
    }
    public String toString(){
        return "Point "+coordinates[0]+"," +coordinates[1];
    }
}
