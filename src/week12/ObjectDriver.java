/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 11/19/2026
 */
package week12;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class ObjectDriver {
    public static void temp(Object o){
        System.out.println(o.toString());
        System.out.println(o.hashCode());
        System.out.println(o.equals(o));
    }
    static void main() {
        ArrayList<Object> objects = new ArrayList<>();
        //ArrayList objects2 = new ArrayList<>();

        objects.add(new Scanner(System.in));
        objects.add(new Integer(42));
        objects.add(new Person("Sally"));
        objects.add(new Salaried("Jill", 1, 50_000));

        Person p1 = new Person("Lily", 35);
        System.out.println(p1);
        Salaried s1 = new Salaried("Jill", 1, 50_000);
        System.out.println(s1);
        Object o1 = p1;
        //Dynamic binding
        System.out.println(o1.toString());
        Person p2 = s1;
        System.out.println(p2.toString());



    }
}

