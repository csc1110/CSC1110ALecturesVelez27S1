/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 10/20/2026
 */
package week8;

public class MemoryAndReferences {
    static void main() {
        int[] numbers = new int[4];
        String[] words = new String[4];

        words[0] = "foo";
        words[1] = "bar";
        words[2] = "taco";
        words[3] = "cat";

        String[] words2 = words;

        for(int i = 0; i < words.length; i++){
            System.out.print(words[i] + " ");
        }
        System.out.println();
        for(int i = 0; i < words2.length; i++){
            System.out.print(words2[i] + " ");
        }
        words[1] = "hello";
        System.out.println("After");
        for(int i = 0; i < words.length; i++){
            System.out.print(words[i] + " ");
        }
        System.out.println();
        for(int i = 0; i < words2.length; i++){
            System.out.print(words2[i] + " ");
        }


    }
}
