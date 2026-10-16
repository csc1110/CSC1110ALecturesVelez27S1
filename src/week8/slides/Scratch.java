/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 10/16/2026
 */
package week8.slides;

public class Scratch {
    static void main() {
        int[] nums = new int[3];
        nums[0] = 42;
        nums[1] = 67;
        nums[2] = -1;

        System.out.println(nums[0]);
        System.out.println(nums[1] * 2);
        System.out.println(nums[2] * nums[1] * nums[0]);


        String[] words = new String[3];
        words[0] = "foo";
        words[1] = "bar";
        words[2] = "taco";
        System.out.println(words[0].length());
        System.out.println(words[1].charAt(0));
        System.out.println("taco".equals(words[2]));
    }
}
