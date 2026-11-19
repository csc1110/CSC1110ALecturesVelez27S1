/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 11/19/2026
 */
package week12;

import java.util.ArrayList;
import java.util.Scanner;

public class EqualsExample {
    static void main() {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Sam", 24));
        people.add(new Person("Alex", 30));
        people.add(new Person("Sam", 18));

        for(Person p: people){
            if(p.equals(new Person("Alex", 34))){
                System.out.println("Found them!!!");
            } else {
                System.out.println("Didn't find them.");
            }
        }
    }
}
