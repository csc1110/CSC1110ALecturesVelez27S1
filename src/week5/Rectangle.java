/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 8/14/2026
 */
package week5;

public class Rectangle {
    private int height;
    private int width;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    public void printValues(){
        System.out.println("Width and height are :"+width + " "+ height+".");
    }
    public int perimeter(){
        return height * 2 + width * 2;
    }
}
