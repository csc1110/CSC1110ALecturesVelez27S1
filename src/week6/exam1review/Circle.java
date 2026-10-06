/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 10/5/2026
 */
package week6.exam1review;

public class Circle {
    private double rad;

    public double getRad() {
        return rad;
    }

    public void setRad(double radius) {
        this.rad = radius;
    }
    /**
     * 	(2 points) Given the partial implementation of Circle
     * 	below, create a method called area() that takes in no
     * 	arguments and returns the area of this Circle. Reminder
     * 	A_c=πr^2
     */
    public double area(){
        return Math.PI * Math.pow(rad,2);
    }
}
