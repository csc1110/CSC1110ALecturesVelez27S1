/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 11/17/2026
 */
package week12;


import java.util.ArrayList;

public class EmployeeDriver {
    static void main() {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Salaried("Bob", 1, 50_000));
        employees.add(new Salaried("Sally", 2, 75_000));
        employees.add(new Hourly("Lily", 3, 25, 10));
        employees.add(new Hourly("Sam", 4, 20, 20));
        employees.add(new Comission("Max", 5, .25, 10_000));
        double payroll = 0;
        for(Employee e: employees){
            System.out.println(e.getName());
            e.display();
            payroll += e.getPay();
        }
        System.out.println("Need to pay "+payroll);
    }
}
