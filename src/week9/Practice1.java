/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 10/26/2026
 */
package week9;

import java.util.ArrayList;
import java.util.Scanner;

public class Practice1 {
    static void main() {
//        Create an ArrayList of ints
//        Add 10 random numbers from 0 to 4
//        Print the sum of the first and last numbers
//        Iterate over the ArrayList and find the index of the largest number
//        Replace (overwrite) the largest number with a -1

        ArrayList<Integer> nums = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            nums.add((int)(Math.random() * 5));
        }
        int last = nums.get(nums.size() - 1);
        int first = nums.get(0);
        System.out.println(last + first);

        int maxIndex = 0;
        int maxValue = nums.get(maxIndex);
        for(int i = 1; i < nums.size(); i++){
            if(nums.get(i) > maxValue){
                maxIndex = i;
                maxValue = nums.get(i);
            }
        }
        nums.set(maxIndex, -1);

//        Create an ArrayList of Strings
//        Add 5 Strings from the user
//        See if the first and middle Strings are the same
//        Store the indices in another ArrayList


        ArrayList<String> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        for(int i = 0; i < 5; i++){
            String word1 = scan.nextLine();
            list.add(word1);
            //list.add(i, word1);
        }
        String mid = list.get(list.size()/2);
        String firstWord = list.getFirst();

        if(mid.equalsIgnoreCase(firstWord)){
            System.out.println("they are the same");
        } else {
            System.out.println("They are different");
        }
        //        Iterate over the ArrayList and find the index of all Strings with an ‘a’
        // use the contains() method for the String class e.g., "hello".contains(a) and put
        //it into another arraylist
        ArrayList<Integer> indices = new ArrayList<>();
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).contains("a")){
                indices.add(i);
            }
        }
        //        Replace the Strings that have an ‘a’ with “hello”
        int j = 0;
        for(int i = 0; i < list.size(); i++){
            if(i == indices.get(j)){
                list.set(i, "hello");
                j++;
            }
        }
        for(int i = 0; i < indices.size(); i++){
            list.set(indices.get(i), "hello");
        }
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).toLowerCase().contains("a")){
                list.set(i, "hello");
            }
        }



    }
}
