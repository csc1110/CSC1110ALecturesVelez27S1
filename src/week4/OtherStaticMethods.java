/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 9/21/2026
 */
package week4;

public class OtherStaticMethods {
    static void main() {
        String num = "42";

        System.out.println(Integer.parseInt(num));
        System.out.println(Double.parseDouble(num));

        String msg = "Hello 1234";

        System.out.println(Character.isDigit(msg.charAt(msg.length()-1)));
        char test = ' ';
        System.out.println(Character.isDigit(test));
        System.out.println(Character.isSpaceChar(test));
        System.out.println(Character.isLetter(test));
        System.out.println(Character.isUpperCase(test));
        System.out.println(Character.isLowerCase(test));

        String msg2 = "hello " + String.valueOf(num);
    }
}
