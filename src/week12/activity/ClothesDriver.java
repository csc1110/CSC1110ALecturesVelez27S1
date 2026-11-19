/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 11/17/2026
 */
package week12.activity;

import java.util.ArrayList;

public class ClothesDriver {
    static void main() {
        ArrayList<Clothing> wardrobe = new ArrayList<>();
        wardrobe.add(new ButtonShirt("Cotton", 10));
        wardrobe.add(new ButtonShirt("Flannel", 5));
        wardrobe.add(new Jeans("Suede"));
        wardrobe.add(new Jeans("Cotton"));


        for(Clothing clothing: wardrobe){
            System.out.println("Wearing: " + clothing.getName());
            clothing.wear();
            if(clothing instanceof Jeans){
                Jeans j = (Jeans) clothing;
                int numTears = j.getTears().size();
                if(numTears > 0){
                    System.out.println("\t"+j.getName() + " has "+numTears+" tear(s).");
                }
            }
        }
        System.out.println();
        for(Clothing clothing: wardrobe){
            System.out.println("Cleaning: " + clothing.getName());
            clothing.clean();
            if(clothing instanceof ButtonShirt){
                ButtonShirt b = (ButtonShirt) clothing;
                int missingButtons = b.getMaxButtons() - b.getNumButtons();
                if(missingButtons > 0){
                    System.out.println("\t"+b.getName() + " is missing " +
                            missingButtons+" button(s).");
                }
            }
        }
    }
}
