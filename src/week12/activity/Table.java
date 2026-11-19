/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 11/16/2026
 */
package week12.activity;

public class Table extends Furniture {
    private double width;
    public Table(String material, double basePrice, double width){
        super(material, basePrice);
        this.width = width;
    }

    public double getWidth() {
        return width;
    }
    @Override
    public double getPrice(){
        return width * super.getPrice();
    }
    @Override
    public String getName(){
        return material + "Table";
    }
}
