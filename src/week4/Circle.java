/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 9/22/2026
 */
package week4;

public class Circle {
    private double diameter; //default value 0
    private String color;    //default value is null

    public double getDiameter(){
          return diameter;
    }
    public void testMethod(double diameter){
        diameter = diameter;
        System.out.println("Local diameter " +diameter);
        System.out.println("Instance diameter? "+this.diameter);
        System.out.println("this is testMethod "+this);
    }
    public String getColor(){
        return color;
    }
    public void setDiameter(double diameter){
        this.diameter = diameter;
    }
    public void setColor(String c){
        color = c;
    }
    public void printValues(){
        System.out.println("Diameter is "+diameter);
        System.out.println("Color is "+color);
    }
    public void printValues(String name){
        System.out.println(name);
        printValues();
    }
    private double getRadius(){
        return diameter/2;
    }
    public double area(){
        return Math.PI * Math.pow(getRadius(), 2);
    }

    public double circumference(){
        return Math.PI * 2 * getRadius();
    }

}
