/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 11/17/2026
 */
package week12.activity;

public class ButtonShirt extends Clothing {
    private final int maxButtons;
    private int numButtons;
    public ButtonShirt(String material, int numButtons) {
        super(material);
        this.numButtons = numButtons;
        maxButtons = this.numButtons;
    }
    public void clean(){
        super.clean();
        if(Math.random() < DAMAGE_CHANCE){
            numButtons = Math.max(numButtons - 1, 0);
        }
    }
    public int getNumButtons() {
        return numButtons;
    }
    public int getMaxButtons() {
        return maxButtons;
    }
    @Override
    public String getName() {
        if(isDirty()){
            return "Dirty " + material + " Shirt";
        } else {
            return "Clean " + material + " Shirt";
        }
    }
}
