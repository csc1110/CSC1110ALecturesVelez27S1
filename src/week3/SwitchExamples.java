/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 9/15/2026
 */
package week3;

public class SwitchExamples {
    static void main() {
        String day = "M";

        if(day.equals("M")){
            System.out.println("Spaghetti");
        } else if(day.equals("T")){
            System.out.println("Tacos");
        } else if(day.equals("W") || day.equals("F")){
            System.out.println("Meatloaf");
        } else {
            System.out.println("Invalid day");
        }

        switch (day){
            case "M" -> {
                System.out.println("Spaghetti");
                System.out.println("Yum");
            }
            case "T" -> System.out.println("Tacos");
            case "W" -> System.out.println("Meatloaf");
            default -> System.out.println("Invalid day");
        }

        switch (day){
            case "M":
                System.out.println("Spaghetti");
                break;
            case "T":
                System.out.println("Tacos");
                break;
            default:
                System.out.println();


        }
    }
}
