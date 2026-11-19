/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 11/12/2026
 */
package week11;


import java.util.ArrayList;
import java.util.Random;

//Create an ArrayList of Fruit items called fruits
//Create a method called spawnFruit() that will return
// a Banana or Apple with probability of <0.5, 0.5>
//The Apple should have a random number of seeds from 0 to 10
//Use spawnFruit() to add 10 Fruit objects to fruits
//Display all the objects in fruits
//Use a for-each loop to call the processFruit method of Fruit on each object in fruits
//Create a method called checkFruit() that takes in a Fruit object
//Returns true if the Fruit object is an Apple and has less than 5 seeds
//Use checkFruit() to only process the Fruit objects that are not Apples with less than 5 seeds

public class FruitDriver {
    public static boolean checkFruit(Fruit fruit){
        boolean ret  = false;
        if(fruit instanceof Apple) {
            Apple a = (Apple) fruit;
            if(((Apple)fruit).getNumSeeds() < 5){
                ret = true;
            }
        }
        return ret;
    }
    public static Fruit spawnFruit(){
        Random random = new Random();
        int c = random.nextInt(0,2);
        if(c == 1){
            return new Apple(random.nextInt(0, 11));
        } else {//if (c == 0){
            return new Banana();
        }
    }
    static void main() {
        ArrayList<Fruit> fruits = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            fruits.add(spawnFruit());
        }
        for(Fruit f: fruits){
            f.display();
        }

    }
}
