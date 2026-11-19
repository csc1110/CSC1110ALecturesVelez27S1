/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 11/19/2026
 */
package week12;

import java.util.ArrayList;

public class ClothingDriver {
    static void main() {
        ArrayList<Clothing> clothing = new ArrayList<>();
        clothing.add(new ButtonShirt("cotton", 12));
        clothing.add(new ButtonShirt("flannel", 5));
        //add jeans

        for(Clothing c: clothing){
            System.out.println(c.getName());
            c.wear();
        }
        for(Clothing c: clothing){
            System.out.println(c.getName());
            c.clean();
            if(c instanceof ButtonShirt b){
                int max = b.getMaxButtons();
                int current = b.getNumButtons();
                if(max - current > 0){
                    System.out.println(b.getName());
                    System.out.println("Was damaged.");
                }
            }
        }


    }
}
