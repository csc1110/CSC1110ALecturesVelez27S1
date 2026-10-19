/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 10/16/2026
 */
package week8;

public class ArraysIntro {
    static void main() {
        int[] value;
        value = new int[3];

        value[0] = 42;
        value[1] = -1;

        System.out.println(value[0]);
        System.out.println(value[1] * 10);
        System.out.println(value[2]);

        String[] words = new String[3];
        System.out.println(words[0]);
        words[0] = "foo";
        words[1] = "bar";
        words[2] = "taco";

        String a = "foo";
        System.out.println(a);
        System.out.println(words[0]);

        System.out.println(words[1].charAt(0));
    }
}
