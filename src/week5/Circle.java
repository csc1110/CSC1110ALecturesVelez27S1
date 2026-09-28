/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 8/14/2026
 */
package week5;

public class Circle {
    private double diameter;
    private String color;
    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }
    public double getDiameter() {
        return diameter;
    }
    public void testMethod(double diameter){
        //System.out.println("Value of passed-in diameter: " + diameter);
        //System.out.println("Value of this diameter: " + this.diameter);
        System.out.println("Printing this in testMethod() ");
        System.out.println(this);
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }


    public void printValues(){
        System.out.println("Circle diameter and color are "+
                diameter + " and "+color + ".");
    }

    public void printValues(String name){
        System.out.println("Circle "+name+ " diameter and color are "+diameter + " and "+color + ".");
    }

    public double area(){

        return Math.PI * Math.pow(getRadius(), 2);
    }
    public double circumference(){

        return 2 * getRadius() * Math.PI;
    }
    private double getRadius(){
        return diameter/2;
    }

    /**
     * Compares the called on Circle to the passed in
     * Circle based on their area().
     * @param other Another circle that is passed-in.
     * @return Return true if this circle has a bigger
     * area than the passed in circle.
     */
    public boolean biggerThan(Circle other){
        System.out.println("Circle called on "+this);
        System.out.println("Passed in circle is "+other);
        //boolean bt = this.area() > other.area();
        return this.area() > other.area();
    }

}
