/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 11/17/2026
 */
package week12.activity;

import java.util.ArrayList;
import java.util.Random;

public class Jeans extends Clothing {
    private static final int[] TEAR_SIZE_RANGE = {1, 5};
    private ArrayList<Integer> tears;
    public Jeans(String material) {
        super(material);
        this.tears = new ArrayList<>();
    }
    public void wear(){
        super.wear();
        Random random = new Random();
        if(Math.random() < DAMAGE_CHANCE){
            tears.add(random.nextInt(TEAR_SIZE_RANGE[0],
                    TEAR_SIZE_RANGE[1] + 1));
        }
    }
    public ArrayList<Integer> getTears() {
        return tears;
    }
    @Override
    public String getName() {
        if(isDirty()){
            return "Dirty " + material + " Jeans";
        } else {
            return "Clean " + material + " Jeans";
        }
    }
}
