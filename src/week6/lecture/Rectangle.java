/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 10/5/2026
 */
package week6.lecture;

public class Rectangle {

    private double length;
    private double width;
    private String id;

    public Rectangle (){
        length = 42;
        width = 67;
        id = "foobar";
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
    public void setLength(double length){
        this.length = length;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public void setId(String id){
        this.id = id;
    }


}
