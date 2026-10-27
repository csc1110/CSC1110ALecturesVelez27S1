/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 10/20/2026
 */
package week8;

import java.util.Scanner;

public class NumElements {
    static void main() {
        //Ask the user for 10 ints, but also let them
        //enter -1 to quit entering values.


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter positive 10 values or '-1' to quit");
        final int maxEntries = 10;
        int[] nums = new int[maxEntries];
        boolean done = false;
        int sum = 0;
        int numElements = 0; //location of the next element to place
        //for(int i = 0; i < maxEntries && !done; i++){
        while(!done && numElements < 10){
            System.out.println("Enter positive 10 values or '-1' to quit");
            int input = scan.nextInt();
            if(input >= 0){
                nums[numElements] = input;
                sum += input;
                numElements++;
            } else {
                done = true;
            }
        }
        //And at the end, we want to print out the
        //average of the values that they entered
        double avg = (double) sum / numElements;
        System.out.println("The avereage is "+avg);



    }
}
