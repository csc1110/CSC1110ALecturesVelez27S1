/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 11/16/2026
 */
package week12;

public class Person {
    private final String name;
    protected int age;
    private String pass = "1234";

    public Person(String name){
        this(name, (int)(20 * Math.random()) + 10);
    }
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public boolean unlocked(String guess){
        return guess.equals(pass);
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    @Override
    public String toString(){
        return "Person: "+name+ " age "+age;
    }
}
