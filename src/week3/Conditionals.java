package week3;
import java.util.Scanner;
public class Conditionals{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a non-negative whole number " +
				"between 4 and 10 for the radius.");

		int radius;
		radius = in.nextInt();
		int threshold = 0;

		int lower = 4;
		int upper = 10;

		//if(radius > lower && radius < upper && radius % 2 == 0 && radius != 6){
		//if(radius == 5 || radius > 8){
		//double circumference = 0;
		if (!(radius > lower && radius < upper)) {
			//if(radius <= 4 || radius >= upper){
			double circumference = 3.14 * 2 * radius;
			System.out.println("The circumference is " + circumference);
		} else if (radius == 0) {
			System.out.println("Bad radius: 0");
		} else if (radius == -1) {
			System.out.println("Bad raidius: -1");
		} else {
			System.out.println("Invalid radius " + radius);
		}
		//System.out.println("Circumference was "+circumference);
		System.out.println("Goodbye");
	}
}
