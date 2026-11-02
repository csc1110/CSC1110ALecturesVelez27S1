/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 10/29/2026
 */
package week9;

import java.util.ArrayList;

public class Practice2 {
//    Takes in an ArrayList of Strings and returns the largest String
    private static String largestString(ArrayList<String> list){
        int maxIndex = 0;
        String maxString = list.get(maxIndex);
        for(int i = 1; i < list.size(); i++){
            if(maxString.length() < list.get(i).length()){
                maxIndex = i;
                maxString = list.get(i);
            }
        }
        return maxString;
    }

//    Takes in an int and max value and returns a new ArrayList of random ints
    //randomArray
    private static ArrayList<Integer> randomArray(int size, int max){
        ArrayList<Integer> nums = new ArrayList<>();
        for(int i = 0; i < size; i++){
            int r = (int) (Math.random() * max);
            nums.add(r);
        }
        return nums;
    }

//    Take in an ArrayList of ints and returns a
//    new ArrayList that is the negate
    //called negate
    private static ArrayList<Integer> negate(ArrayList<Integer> nums){
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0; i < nums.size(); i++){
            result.add(nums.get(i) * -1);
        }
        return result;
    }


    static void main() {

    }
}
