/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 11/17/2026
 */
package week12.activity;

public abstract class Clothing {
    protected static final double DAMAGE_CHANCE = 0.5;
    protected String material;
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
    public boolean isDirty() {
        return dirty;
    }
    public abstract String getName();
}
