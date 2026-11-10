/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 11/10/2026
 */
package week11;

public class Food implements Sellable {
    private int calories;

    public Food(int calories) {
        this.calories = calories;
    }

    public int getCalories() {
        return calories;
    }

    @Override
    public double getPrice(){
        return 100 * calories;
    }

    /**
     * Displays the properties of the item.
     */
    @Override
    public void display() {
        System.out.println("Food with "+calories+" calories.");
    }

}
