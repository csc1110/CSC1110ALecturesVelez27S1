/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 8/10/2026
 */
package week4;

public class MathExamples2 {
    static void main() {
        final double num1 = -2.5;
        final double num2 = 4;
        //Abs and sqrt
        System.out.println("Absolute value of "+num1+" is "+Math.abs(num1));
        System.out.println("Square root of "+num1+" is "+Math.sqrt(num2));
        //Rounding
        System.out.println(num1+" rounds to nearest whole "+Math.round(num1));
        System.out.println(num1+" rounded up "+Math.ceil(num1));
        System.out.println(num1+" rounded down "+Math.floor(num1));
        //Max and min
        System.out.println("Max of "+num1+" and "+num2+" is "+Math.max(num1, num2));
        System.out.println("Min of "+num1+" and "+num2+" is "+Math.min(num1, num2));
        //Powers
        System.out.println(num2+" squared is "+Math.pow(num2,2));
        System.out.println(num2+" cubed is "+Math.pow(num2,3));
        System.out.println("10 raised to " + (int)Math.log10(1000) + " is 1000.");
        System.out.println("2 raised to  "+ (int)(Math.log(64)/Math.log(2)) + " is 64");
    }
}
