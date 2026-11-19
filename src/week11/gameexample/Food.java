/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 11/10/2026
 */
package week11.gameexample;

public class Food implements Sellable, Consumable {
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
    /**
     * Allows you to use a percent of an object.
     *
     * @param percent How much of the object to use.
     */
    @Override
    public void use(double percent) {
        calories = (int)(calories * (1 - percent));
    }
}
