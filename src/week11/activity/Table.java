/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 11/16/2026
 */
package week11.activity;

public class Table extends Furniture {
    private double width;
    public Table(String material, double width){
        super(material);
        this.width = width;
    }
    public String getName(){
        return getMaterial() + "Table";
    }
    public double getPrice(){
        return price;
    }
}
