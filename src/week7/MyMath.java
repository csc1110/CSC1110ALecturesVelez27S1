/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 10/12/2026
 */
package week7;

public class MyMath {
    public static final double PI = 3;
    private String temp;
    public void setTemp(String temp) {
        this.temp = temp;
    }
    public String getTemp() {
        System.out.println("This inside of getTemp "+ this);
        this.setTemp("foobar");
        System.out.println(MyMath.add(3,4));
        return temp;
    }
    public static double add(double a, double b){
        //setTemp("foobar");
        return a + b;
    }
    public static double mult(double a, double b){
        return a * b;
    }
    public static double circleCircumference(double radius){
        return mult(radius,2) * PI;
    }


}
