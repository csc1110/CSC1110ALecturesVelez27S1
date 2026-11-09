/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 11/2/2026
 */
package week10;

public class Point {
    private int[] coordinates;
    public Point(int x, int y){
        coordinates = new int[2];
        coordinates[0] = x;
        coordinates[1] = y;
    }
    public Point(int[] coordinates) {
        this(coordinates[0], coordinates[1]);
    }
    public Point(){
        this(0,0);
    }
    public double dist(Point point){
        int x1 = point.getCoordinates()[0];
        int y1 = point.getCoordinates()[1];
        return Math.sqrt(Math.pow(x1 - coordinates[0], 2) +
                Math.pow(y1 - coordinates[1],2));
    }
    public int[] getCoordinates(){
        return coordinates;
    }
    public void move(int dx, int dy){
        this.coordinates[0] += dx;
        this.coordinates[1] += dy;
    }
    public String toString(){
        return "Point "+coordinates[0]+"," +coordinates[1];
    }
    public static int quadrant(Point point){
        int x = point.getCoordinates()[0];
        int y = point.getCoordinates()[1];
        if(x >= 0 && y >= 0){
            return 1;
        } else if (x < 0 && y >=0){
            return 2;
        } else if (x < 0 && y < 0){
            return 3;
        } else {
            return 4;
        }
    }
}
