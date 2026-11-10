/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 11/9/2026
 */
package week11;

import java.util.ArrayList;

public class GameManager {
    static void main() {

        ArrayList<HealingPotion> inventory = new ArrayList<>();
        ArrayList<Weapon> inventoryWeapons = new ArrayList<>();

        for(int i = 0; i < 4; i++){
            int r = (int)(Math.random() * 10) + 5;
            inventory.add(new HealingPotion(r));
        }
        for(int i = 0; i < 6; i++){
            int r = (int)(Math.random() * 50) + 10;
            inventoryWeapons.add(new Weapon(r));
        }

        System.out.println("Displaying items");
        for(int i = 0; i < inventory.size(); i++){
            inventory.get(i).display();
        }
        for(int i = 0; i < inventoryWeapons.size(); i++){
            inventoryWeapons.get(i).display();
        }

        int sellPrice = 0;
        for(int i = 0; i < inventory.size(); i++){
            sellPrice += inventory.get(i).getPrice();
        }
        for(int i = 0; i < inventoryWeapons.size(); i++){
            sellPrice += inventoryWeapons.get(i).getPrice();
        }
        System.out.println("Sold for "+sellPrice);
    }
}
