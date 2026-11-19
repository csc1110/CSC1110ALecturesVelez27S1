/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 11/11/2026
 */
package week11.activity;

public class Banana implements Fruit{
    private boolean peeled;
    public Banana(){
        peeled = false;
    }
    public boolean isPeeled() {
        return peeled;
    }
    @Override
    public boolean isPrepped() {
        return peeled;
    }
    @Override
    public void prep() {
        peeled = true;
    }
    @Override
    public void display() {
        if(isPrepped()){
            System.out.println(Fruit.PREPPED_COLOR +"Banana"+Fruit.RESET);
        } else {
            System.out.println(Fruit.NOT_PREPPED_COLOR +"Banana"+Fruit.RESET);
        }
    }
}
