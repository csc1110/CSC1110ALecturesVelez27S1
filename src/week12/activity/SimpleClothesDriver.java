/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 11/17/2026
 */
package week12.activity;

public class SimpleClothesDriver {
    static void main() {
        ButtonShirt b = new ButtonShirt("Cotton", 10);
        Jeans j = new Jeans("Suede");
        System.out.println(b.getName());
        j.wear();
        System.out.println(j.getName());
    }
}
