/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 10/5/2026
 */
package week6.lecture;

public class Rectangle {
    /**
     * Minimum dimension for any of the sides of the Rectangle
     */
    public static final int MIN_LEN = 5;
    private final double length;
    private final double width;
    private String id;

    public Rectangle(){

        this(0,0,null);
    }
    public Rectangle(double side){
        this(side, side, "Rectangle");
     }
    public Rectangle (double length,
                      double width,
                      String id){
        if(length < MIN_LEN){
            this.length = MIN_LEN;
        } else {
            this.length = length;
        }
        if(width < MIN_LEN){
            this.width = MIN_LEN;
        } else {
            this.width = width;
        }
        this.id = id;
    }

    public Rectangle(double length, double width){
        this(length, width, "rectangle:");
    }


    public double getLength(){
        return length;
    }
    public double getWidth(){
        return width;
    }
    public String getId(){
        return id;
    }
//    public void setLength(double length){
//        this.length = length;
//    }
//    public void setWidth(double width){
//        this.width = width;
//    }
    public void setId(String id){
        this.id = id;
    }

    public String toString(){
        return "Rectangle {"+width+","+length+"+"+id+"}";
    }


}
