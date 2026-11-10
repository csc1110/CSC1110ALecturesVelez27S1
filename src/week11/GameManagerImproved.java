/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 11/9/2026
 */
package week11;

import java.util.ArrayList;
import java.util.Random;

public class GameManagerImproved {
    static void main() {
        ArrayList<Sellable> inventory = new ArrayList<>();
        int numItems = 10;
        Random random = new Random();
        for(int i = 0; i < numItems; i++){
            int r = random.nextInt(0,3);
            if(r == 0){
                inventory.add(new Weapon(random.nextInt(5, 10)));
            } else if(r == 1){
                inventory.add(new Food(random.nextInt(100, 1000)));
            } else {
                inventory.add(new HealingPotion(random.nextInt(1, 8)));
            }
        }
        for(Sellable s: inventory){
            s.display();
        }
        int sellPrice = getSellPrice(inventory);
        System.out.println("Sold for "+sellPrice);
    }

    private static int getSellPrice(ArrayList<Sellable> inventory) {
        int sellPrice = 0;
        for(int i = 0; i < inventory.size(); i++){
            Sellable s = inventory.get(i);
            if(!(s instanceof Food)) {
                if(s instanceof Weapon){
                   int d = ((Weapon) s).getDmg();
                   if(d < 10){
                       sellPrice += Sellable.SELL_MODIFIER * inventory.get(i).getPrice();
                   }
                } else {
                    sellPrice += Sellable.SELL_MODIFIER * inventory.get(i).getPrice();
                }
            }
        }
        return sellPrice;
    }
}
