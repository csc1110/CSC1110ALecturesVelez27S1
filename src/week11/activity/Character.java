/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 11/11/2026
 */
package week11.activity;

public class Character {
    private String moveMode;

    public Character(String moveMode) {
        this.moveMode = moveMode;
    }

    public String getMoveMode() {
        return moveMode;
    }

    public void setMoveMode(String moveMode) {
        this.moveMode = moveMode;
    }

    public void move(){
        switch (moveMode){
            case "walk" -> System.out.println("Walking casually.");
            case "sneak" -> System.out.println("Sneaking stealthily.");
            case "run" -> System.out.println("Running hurriedly.");
        }
    }
}
