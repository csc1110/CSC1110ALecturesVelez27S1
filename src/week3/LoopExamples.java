/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 9/15/2026
 */
package week3;

public class LoopExamples {
    static void main() {
        //All loops contain
        //control variable initialization
        int count = 0;
        System.out.println("While loop");
        //condition the determines when the loop stops
        while(count < 10){
            System.out.println("Count is "+count);
            //update control variable
            count++;
        }
        System.out.println("Final count was "+count);

        System.out.println("do-while loop");
        count = 0;
        do{
            System.out.println("Count is "+count);
            count++;
        } while(count < 0);
        System.out.println("Final count was "+count);

        System.out.println("for loop");
        //variable initalization
        //variable update
        //condition
        int i;
        for(i = 0;i < 10;i++){
            System.out.println("Count is "+i);
        }
        System.out.println("I is "+i);

    }
}
