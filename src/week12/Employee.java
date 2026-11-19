/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 11/16/2026
 */
package week12;

public abstract class Employee extends Person {
    private int id;
    public Employee(String name, int id){
        super(name);
        this.id = id;
    }
    @Override
    public String getName(){
        return super.getName() + ":" + id;
    }

    public int getId() {
        return id;
    }
    public void display(){
        System.out.println(this.getName());
    }
    public boolean isAdult(){
        return age > 18;
    }
    public abstract double getPay();//{
//        return 0;
//    }
}
