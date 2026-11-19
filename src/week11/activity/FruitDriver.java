/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 11/11/2026
 */
package week11.activity;

import java.util.ArrayList;
import java.util.Random;

public class FruitDriver {
    private static Fruit spawnFruit(){
        Random random = new Random();
        if(random.nextInt(0,2) == 0){
            return new Apple(random.nextInt(0, 11));
        } else {
            return new Banana();
        }
    }
    private static boolean excludeFruit(Fruit fruit){
        boolean ret = false;
        if(fruit instanceof Apple){
            if(((Apple) fruit).getNumSeeds() < 10){
                ret = true;
            }
        }
        return ret;
    }
    static void main() {
        ArrayList<Fruit> fruits = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            fruits.add(spawnFruit());
        }
        for(Fruit f: fruits){
            f.display();
        }
        for(int i = 0; i < fruits.size(); i++){
            if(!excludeFruit(fruits.get(i))){
                Fruit.processFruit(fruits.get(i));
            }
        }
    }

}
