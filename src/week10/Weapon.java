/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 11/9/2026
 */
package week10;

public class Weapon {
    private int dmg;

    public Weapon(int dmg) {
        this.dmg = dmg;
    }

    public int getDmg() {
        return dmg;
    }
    public void display(){
        System.out.println("Weapon: "+dmg);
    }
    public double getPrice(){
        return 2 * dmg;
    }
}
