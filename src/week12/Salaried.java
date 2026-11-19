/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 11/17/2026
 */
package week12;

public class Salaried extends Employee {
    public static final double RAISE_AMOUNT = 0.1;
    public static final int NUM_PAY_PERIODS = 24;
    private double salary;
    public Salaried(String name, int id, double salary){
        super(name, id);
        this.salary = salary;
    }
    public void raise(){
        salary = salary * (1 + RAISE_AMOUNT);
    }
    public double getPay(){
        return salary / NUM_PAY_PERIODS;
    }
    @Override
    public void display(){
        super.display();
        System.out.println("Salary: "+salary);
    }
    @Override
    public String toString(){
        return super.toString() + " salary "+ salary;
    }
}
