/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 10/16/2026
 */
package week8;

public class Exercises {
    private static void prompt1(){
//        Create and initialize an array of doubles of size 3
//        Set each element in the array to some number
//        Print out all the elements individually
//        Use a loop to print out all the elements
//        Use a loop to set all the elements to random numbers

        double[] nums = new double[3];
        nums[0] = 42;
        nums[1] = Math.PI;
        nums[2] = 2;

        System.out.println(nums[2]);
        System.out.println(nums[0]);
        System.out.println(nums[1]);
        for(int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }

        for(int i = 0; i < nums.length; i++){
            nums[i] = Math.random();
        }

    }
    private static void prompt2(){
//        Create and initialize an array of Strings of size 3
//        Set each element to any String
//        Print out all the elements and their last letter
//        Use a loop to print out all the elements and their length
//        Use a loop to create a new word that is the first half of each word
        String[] list = new String[3];
        list[0] = "tacocat";
        list[1] = "foobar";
        list[2] = "helloworld";
        //index 2
        System.out.println(list[2]);
        //last character
        System.out.println(list[2].charAt(list[2].length() - 1));


    }
    static void main() {

    }
}
