/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 11/19/2026
 */
package week12;

public class ButtonShirt extends Clothing {
    private int numButtons;
    private int maxButtons;
    public ButtonShirt(String material, int numButtons){
        super(material);
        this.numButtons = numButtons;
        this.maxButtons = numButtons;
    }

    public int getNumButtons() {
        return numButtons;
    }

    public int getMaxButtons() {
        return maxButtons;
    }

    public void clean(){
        super.clean();
        if(Math.random() < DAMAGE_CHANCE){
            numButtons = Math.max(0, numButtons - 1);
        }
    }
    public String getName(){
        if(isDirty()){
            return "Dirty " + material + " Shirt";
        } else {
            return "Clean " + material + " Shirt";
        }
    }


}
