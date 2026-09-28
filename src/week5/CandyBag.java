/*
 * Course: Class - Section
 * Semester Year
 * Assignment # - Assignment Name
 * Name: Your Name
 * Created: 9/28/2026
 */
package week5;

public class CandyBag {
    private static final int MAX_CANDIES = 10;
    private int numCandies;

    public int getNumCandes(){
        return numCandies;
    }
    public void setNumCandies(int numCandies){
        if(numCandies < 0){
            numCandies = 0;
        } else if (numCandies > MAX_CANDIES){
            numCandies = MAX_CANDIES;
        }
        this.numCandies = numCandies;
    }
    public void fillBag(){
        setNumCandies(MAX_CANDIES);
    }
}
