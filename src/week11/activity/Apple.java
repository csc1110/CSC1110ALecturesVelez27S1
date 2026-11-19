/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 11/11/2026
 */
package week11.activity;

public class Apple implements Fruit {
    private int numSeeds;
    public Apple(int numSeeds){
        this.numSeeds = numSeeds;
    }
    public int getNumSeeds() {
        return numSeeds;
    }
    @Override
    public boolean isPrepped() {
        return numSeeds == 0;
    }
    @Override
    public void prep() {
        numSeeds = 0;
    }
    @Override
    public void display() {
        if(isPrepped()){
                System.out.println(Fruit.PREPPED_COLOR +"Apple"+Fruit.RESET);
        } else {
            System.out.println(Fruit.NOT_PREPPED_COLOR +"Apple"+Fruit.RESET);
        }
    }
}
