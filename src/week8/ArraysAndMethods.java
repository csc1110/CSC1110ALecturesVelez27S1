/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 10/20/2026
 */
package week8;

public class ArraysAndMethods {
//    Create a method that takes an array and an int
//    Check if the int is out of bounds
//    If it is out of bounds return 0, else return the
//    element at that index
    //indexAt()
    private static int indexAt(int[] nums, int index){
        if(index < 0 || index >= nums.length){
            return 0;
        } else {
            return nums[index];
        }
    }

//    Create a method that take in an array and returns the min
//    Make two more methods that return the max and average
    //min()


//    Create a method that takes in an array of ints and returns
//    a new array that contains the first half of elements
//    of the original.
    //firstHalf()
    private static int[] firstHalf(int[] nums){
        int[] ret = new int[nums.length / 2];
        for(int i = 0; i < ret.length; i++){
            ret[i] = nums[i];
        }
        return ret;
    }


    private static void printArray(int[] nums){
        System.out.print("[");
        for(int i = 0; i < nums.length; i++){
            if(i == nums.length - 1){
                System.out.print(nums[i]);
            } else {
                System.out.print(nums[i] + ", ");
            }
        }
        System.out.println("]");
    }
    //this method makes and returns a new array of ints
    private static int[] randomArray(int size, int max){
        int[] ret = new int[size];
        for(int i = 0; i < ret.length; i++){
            ret[i] = (int)(Math.random() * max) + 1;
        }
        return ret;
    }
    static void main() {
        int[] nums = randomArray(5, 10);
        printArray(nums);
        nums[0] = -42;
        printArray(nums);

    }
}
