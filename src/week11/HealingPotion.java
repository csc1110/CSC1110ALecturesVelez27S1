/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 11/9/2026
 */
package week11;

public class HealingPotion implements Sellable {
    private int maxRestore;

    public HealingPotion(int maxRestore) {
        this.maxRestore = maxRestore;
    }

    public int getMaxRestore() {
        return maxRestore;
    }

    public void display(){
        System.out.println("Healing Potion: "+maxRestore);
    }

    public double getPrice(){
        return 1.5 * maxRestore;
    }
}
