/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 11/19/2026
 */
package week12;

public abstract class Clothing {
    public static final double DAMAGE_CHANCE = 0.5;
    protected final String material;
    private boolean dirty;

    public Clothing(String material) {
        this.material = material;
        dirty = false;
    }
    public void wear(){
        dirty = true;
    }
    public void clean(){
        dirty = false;
    }
    public boolean isDirty(){
        return dirty;
    }
    public abstract String getName();


}
