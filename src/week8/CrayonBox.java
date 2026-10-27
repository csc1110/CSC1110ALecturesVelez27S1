/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 10/22/2026
 */
package week8;

public class CrayonBox {
    private static final int MAX_COLORS = 4;
    private String[] colors;
    private int numColors;

    public CrayonBox(){
        colors = new String[MAX_COLORS];
        numColors = 0;
    }
    public CrayonBox(String[] colors){
        this.colors = new String[MAX_COLORS];

        for(int i = 0; i < MAX_COLORS && i < colors.length; i++){
            this.colors[i] = colors[i];
            numColors++;
        }
    }
    public int getNumColors() {
        return numColors;
    }
    public void addColor(String color){
        if(numColors < MAX_COLORS){
            this.colors[numColors] = color;
            numColors++;
        }
    }
    public String getLastColor(){
        if(numColors == 0){
            return null;
        } else {
            return colors[numColors - 1];
        }
    }
}
