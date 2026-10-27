/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 10/27/2026
 */
package week9;

import java.util.ArrayList;

public class ArrayListAndMethods {

    //reverse that makes a new ArrayList of Integer that is
    // the reverse of a passed-in ArrayList
    private static ArrayList<Integer> reverse(ArrayList<Integer> list){
        ArrayList<Integer> rev = new ArrayList<>();
        for(int i = 0; i < list.size(); i++){
            //rev.add(0, list.get(i));
            rev.add(list.get(list.size() - 1 - i));
        }
        return rev;
    }
    //method that takes in a size and max value and returns an ArrayList
    //of random ints
    private static ArrayList<Integer> randomArray(int size, int max){
        return null;
    }
    private static void negate(ArrayList<Integer> list){
        for(int i = 0; i < list.size(); i++){
            list.set(i, list.get(i) * -1);
        }
    }

    static void main() {
        ArrayList<Integer> nums = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            nums.add(i);
        }
        ArrayList<Integer> nums1 = nums;

        System.out.println(nums);
        System.out.println(nums1);

        nums.set(0, 42);
        System.out.println(nums);
        System.out.println(nums1); //will this be [0, 1, 2, ...

        negate(nums);

        System.out.println(nums);




    }
}
