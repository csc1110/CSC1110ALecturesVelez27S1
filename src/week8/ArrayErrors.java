/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 10/19/2026
 */
package week8;

public class ArrayErrors {
    static void main() {
        String[] guesses;
        guesses = new String[3];
        String pass = "1234";

        System.out.println(guesses[0]);
        guesses[0] = "foo";
        guesses[2] = "bar";

        for(int i = 0; i < guesses.length; i++){
            if(guesses[i].equals(pass)){
                System.out.println("Access Granted!!!");
            }
        }
    }
}
