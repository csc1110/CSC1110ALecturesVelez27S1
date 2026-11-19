/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 11/16/2026
 */
package week12.activity;

import java.util.ArrayList;

public class TableDriver {
    static void main() {
        ArrayList<Furniture> furnitures = new ArrayList<>();
        furnitures.add(new Furniture("steel", 100));
        furnitures.add(new Table("wood", 200, 10));

        for(Furniture f: furnitures){
            if(f instanceof Table){
                System.out.println(((Table) f).getWidth());
            }
            System.out.println(f.getName());
            System.out.println(f.getPrice());
        }
    }
}
