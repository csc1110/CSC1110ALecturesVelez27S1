/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 10/19/2026
 */
package week8;

import java.util.Scanner;

public class Exercise2 {
    static void main() {
//        Prompt 3
//        Ask the user for the size of an array and create an array of ints of that size
//        Ask the user to enter numbers to store in each index of the array
//        After they have entered all the values in the array find the sum, avg, min and max
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a size for an array");
        int size = scan.nextInt();
        int[] nums;
        nums = new int[size]; //size is 3

        for(int i = 0; i < nums.length; i++){
            int input = scan.nextInt();
            nums[i] = input;
        }
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
        double avg = (double)sum/nums.length;
        int minIndex = 0;
        int minValue = nums[minIndex];
        for(int i = 1; i < nums.length; i++){
            if(nums[i] < minValue){
                minValue = nums[i];
                minIndex = i;
            }
        }



//        Prompt 4
//        Create an array of ints of size 10 and fill with random ints from 1 to 10
//        Find the average size then
//        create two new arrays, one that contains all the ints less than the average
//        and one that contains everything else

        int[] numbers = new int[10];
        int sum2 = 0;
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = (int) (Math.floor(Math.random() * 10) + 1);
            sum2 += numbers[i];
        }
        double avg2 = (double)sum2 / numbers.length;
        int numLess = 0;
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] < avg2){
                numLess++;
            }
        }
        int[] smaller = new int[numLess];
        int[] larger = new int[numbers.length - numLess];
        int j = 0;
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] < avg2){
                smaller[j] = numbers[i];
                j++;
            }
        }

    }
}
