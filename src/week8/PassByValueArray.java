/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 10/22/2026
 */
package week8;

public class PassByValueArray {
    private static void printArray(int[] list){
//        for(int i = 0; i < list.length; i++){
//            System.out.print(list[i] + " ");
//        }
        for(int i: list){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    private static void negate(int[] list){
//        for(int i = 0; i < list.length; i++){
//            list[i] = list[i] * -1;
//        }
        int index = 0;
        for(int i: list){
            list[index] = i * -1;
            index++;
        }
    }
    private static int[] copyArray(int[] original){
        int[] copy = new int[original.length];
        for(int i = 0; i < original.length; i++){
            copy[i] = original[i];
        }
        return copy;
    }
    static void main() {
        int[] nums = {1,2,3,4,5};
        printArray(nums);
        int[] numCopy = copyArray(nums);
        negate(numCopy);
        System.out.println("Nums");
        printArray(nums);
        System.out.println("NumCopy");
        printArray(numCopy);

        String[] words = {"foo", "bar", "taco", "cat"};
        for(String s: words){
            System.out.println(s.length());
        }
    }
}
