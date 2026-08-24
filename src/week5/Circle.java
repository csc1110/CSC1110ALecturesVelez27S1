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
    public boolean biggerThan(Circle other){
        return this.area() > other.area();
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }
    public double getDiameter() {
        // the this is redundant because
        // there is only one diameter in scope
        // you can just write
        // return diameter
        return this.diameter;
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
    public void setColor(String c) {
        color = c;
    }


    public void printValues(){
        System.out.println("Circle diameter and color are "+diameter + " and "+color + ".");
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

//    public void setValues(double d, String c){
//        diameter = d;
//        color = c;
//    }


}
