/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 11/16/2026
 */
package week12.activity;

public class Furniture {
    protected String material;
    private double basePrice;

    public Furniture(String material, double basePrice) {
        this.material = material;
        this.basePrice = basePrice;
    }

    public double getPrice() {
        return basePrice;
    }
    public String getName(){
        return material + "Furniture";
    }
}
