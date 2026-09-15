/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 9/15/2026
 */
package week3;

import java.util.Scanner;

public class NestedIfHemishpereA {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Are we in the North (N) or South (S) Hemisphere?");
        String ans = scan.next();
        System.out.println("What month number is it?");
        int month = scan.nextInt();
        if(ans.equals("N")){
            if(month > 9 || month < 3){
                System.out.println("It is cold");
            } else{
                System.out.println("It is warm");
            }
        } else{
            if(month > 9 || month < 3){
                System.out.println("It is warm");
            } else{
                System.out.println("It is cold");
            }
        }
    }
}

