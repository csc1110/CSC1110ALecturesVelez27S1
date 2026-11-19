/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 11/17/2026
 */
package week12;

public class Hourly extends Employee {
    private double rate;
    private double hours;

    public Hourly(String name, int id, double rate, double hours) {
        super(name, id);
        this.rate = rate;
        this.hours = hours;
    }
    public void addHours(double hours){
        this.hours += hours;
    }
    public double getPay(){
        return rate * hours;
    }
    @Override
    public void display(){
        super.display();
        System.out.println("Rate and hours are "+rate + " , "+hours+".");
    }
}
