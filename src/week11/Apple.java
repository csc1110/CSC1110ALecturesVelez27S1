/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 11/12/2026
 */
package week11;

public class Apple implements Fruit {

    private int numSeeds;

    public Apple(int numSeeds) {
        this.numSeeds = numSeeds;
    }
    public void removeSeeds(){
        this.numSeeds = 0;
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
        removeSeeds();
    }
    @Override
    public void display() {
        if(isPrepped()){
            System.out.println(PREPPED_COLOR+ "Apple" + Fruit.RESET);
        } else {
            System.out.println(Fruit.NOT_PREPPED_COLOR + "Apple" + Fruit.RESET);
        }
    }
}
