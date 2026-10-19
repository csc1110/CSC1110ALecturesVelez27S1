/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 10/16/2026
 */
package week8;

public class ArrayIterate {
    static void main() {
        int[] nums = new int[3];
        nums[0] = 5;
        nums[1] = 10;
        nums[2] = 15;

        int x = 5;
        int y = 10;
        int z = 15;

        String word = "Hello world!";
        System.out.println(word.length());
        System.out.println(word.charAt(0));
        for(int i = 0; i<word.length(); i++){
            System.out.println(word.charAt(i));
        }

        System.out.println(nums[0]);
        System.out.println(nums.length);
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
            sum += nums[i];
        }
        System.out.println(sum);
    }
}
