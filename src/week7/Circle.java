/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 10/12/2026
 */
package week7;

public class Circle {
    /**
     * Constant that determines the minimum radius for
     * this Circle.
     */
    public static final int MIN_RADIUS = 1;
    private double radius;
    private String id;
    public static int count = 0;

    public Circle(double radius, String id){
        final int minRadius = 1;
        this.radius = Math.max(MIN_RADIUS, radius);
        this.id = id;
        count++;
    }
    public double getRadius() {
        return radius;
    }
    public String getId() {
        return id;
    }
    public void setRadius(double radius) {
        this.radius = Math.max(MIN_RADIUS, radius);
    }
    public String toString(){
        StringBuilder sb =new StringBuilder();
        sb.append("Circle: ");
        sb.append(" Radius: "+radius);
        sb.append(" ID: "+id);
        return sb.toString();
    }
}
