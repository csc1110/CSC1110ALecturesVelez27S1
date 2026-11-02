/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 10/29/2026
 */
package week9;

import week8.ArraysAndMethods;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListOtherMethods {
    static void main() {
        String[] w = {"foo", "bar", "foo", "taco", "cat", "taco"};
        ArrayList<String> words = new ArrayList<>(Arrays.asList(w));
        System.out.println(words);

        System.out.println(words.indexOf("taco"));
        System.out.println(words.indexOf("hello"));
        System.out.println(words.lastIndexOf("taco"));
        System.out.println("Before "+ words);
        System.out.println(words.size());
        words.remove("foo");
        System.out.println("After "+ words);
        System.out.println(words.size());

        while(words.contains("taco")){
            words.remove("taco");
        }
        System.out.println(words);
        System.out.println(words.isEmpty());
        while(!words.isEmpty()){
            words.remove(0);
        }
        System.out.println(words.isEmpty());
        System.out.println(words);

        Integer[] n = {3,1,2,5,4};
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(n));
        nums.remove((Integer) 3);
        System.out.println(nums);

        Double[] n2 = {3.0,1.0,2.0,5.0,4.0};
        ArrayList<Double> nums2 = new ArrayList<>(Arrays.asList(n2));
        nums2.remove(3.0);
        //nums2.remove(3);
        System.out.println(nums2);

        for(Double d: nums2){
            System.out.println(d * 2);
        }








    }
}
