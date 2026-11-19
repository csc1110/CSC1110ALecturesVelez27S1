/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 11/17/2026
 */
package week12;

public class Comission extends Employee {
    private double rate;
    private double totalSales;

    public Comission(String name, int id, double rate, double totalSales) {
        super(name, id);
        this.rate = rate;
        this.totalSales = totalSales;
    }
    public void addSale(double sale){
        totalSales += sale;
    }
    @Override
    public void display(){
        super.display();
        System.out.println("Rate and total sales "+rate + ", "+totalSales);
    }
    @Override
    public double getPay(){
        return rate * totalSales;
    }
}
