/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 11/2/2026
 */
package week11;

import week10.Point;

import java.util.ArrayList;

public class Square {
    public static final int MIN_SIDE = 2;
    private final int side;
    private Point lowerLeft;

    public Square(int side, Point lowerLeft){
        this.side = side;
    }
    public Square(){
        this.side = 0;
    }
    public void move(int dx, int dy){

    }
    public ArrayList<Point> vertices(){
        return null;
    }
    public boolean hit(Point other){
        return false;
    }
    public boolean biggerThan(Square other){
        return false;
    }
    public String toString(){
        return null;
    }
    private double area(){
        return 0;
    }
    private static int verifySide(int side){
        return 0;
    }

}
