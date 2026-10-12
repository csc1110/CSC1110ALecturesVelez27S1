/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 10/8/2026
 */
package week6;

public class Circle {
    public static final int MIN_RADIUS = 1;
    private final int radius;
    private String color;
    private int cx;
    private int cy;

    public Circle(int radius, String color,
                  int cx, int cy){
        this.radius = Math.max(MIN_RADIUS, radius);
//        if(radius < MIN_RADIUS){
//            this.radius = MIN_RADIUS;
//        } else {
//            this.radius = radius;
//        }
        this.color = color;
        this.cx = cx;
        this.cy = cy;
    }
    public int getCx() {
        return cx;
    }
    public int getCy() {
        return cy;
    }
    public int getRadius() {
        return radius;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setCx(int cx) {
        this.cx = cx;
    }
    public void setCy(int cy) {
        this.cy = cy;
    }
    public void setCenter(int cx, int cy){
        this.cx = cx;
        this.cy = cy;
    }
    public double getArea(){
        return Math.PI * Math.pow(radius,2);
    }
    public String display(){
        return "Circle: ("+cx+","+cy+")" +
                "radius: "+radius + "color: "+color;
    }
    public boolean biggerThan(Circle other){
        return false;
    }
    public boolean hit(int x, int y){
        return false;
    }


}
