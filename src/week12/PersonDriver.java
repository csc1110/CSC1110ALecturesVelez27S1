/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 11/16/2026
 */
package week12;

import java.util.ArrayList;

public class PersonDriver {
    static void main() {
        Person p1 = new Person("Bob");
//        System.out.println(p1.getName());
        //Employee e1 = new Employee("Sara", 42);
        Employee e1 = new Salaried("Sara", 4, 30_000);
//        System.out.println(e1.getName());
        //e1.display();

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("Jill"));
        //persons.add(new Employee("Jack", 10));

        for(Person p: persons){
            System.out.println(p.getAge());
            if(p instanceof Employee){
                Employee e = (Employee)p;
                System.out.println(e.getId());
            } else {
                System.out.println(p.getName());
            }
        }

    }
}
