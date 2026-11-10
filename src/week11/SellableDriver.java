/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 11/10/2026
 */
package week11;

import java.util.ArrayList;

public class SellableDriver {
    static void main() {
        Sellable s1;
        //s1 = new Sellable();
        s1 = new Weapon(12);
        s1 = new HealingPotion(4);

        ArrayList<Sellable> sellables = new ArrayList<>();
        sellables.add(new Weapon(1));
        sellables.add(new HealingPotion(3));

        for(Sellable s: sellables){
            s.display();
            System.out.println(s.getPrice());
        }

    }
}
