package edu.wit.cs.comp1000;
import java.util.Scanner;
/**
 * LA2a
 * @author Miles Macchiaroli
 *
 */
public class LA2a {
/**
 * This program computes the area, perimeter, and
 * interior angle of a regular polygon
 * @param args
 */
	public static void main(String[] args) {//MAIN
		Scanner input = new Scanner(System.in);//Call Scanner
		//VARS
		int sides;
		double length;
		double area;
		double perimeter;
		double intAngle;
		//IN
		System.out.printf("Enter number of sides: ");
			sides = input.nextInt();
			System.out.printf("Enter side length: ");
			length = input.nextDouble();
			if (sides < 3) {
				System.out.printf("A polygon must have at least 3 sides.%n");
				System.exit(0);}//Quit if invalid
			else if (length <= 0) {System.out.printf("Side length must be positive.%n");
			System.exit(0);}//Quit if invalid
			else {
				//CALCULATE - Print
				area = area(sides, length);
				System.out.printf("Area: %.3f%n", area);
				perimeter = perimeter(sides, length);
				System.out.printf("Perimeter: %.3f%n", perimeter);
				intAngle = intang(sides);
				System.out.printf("Interior Angle: %.3f degrees%n", intAngle);
			}
				}
	public static double area(int n, double s) {//CALC AREA
		double ans;
		ans = (Math.pow(s, 2)*n)/(4*Math.tan((Math.PI/n)));
		return ans;
	}
	public static double perimeter(int n, double s) {//CALC Perm
		double ans;
		ans = (n*s);
		return ans;
	}
	public static double intang(int n) {//CALC IntAngle
		double ans;
		ans = (180-(360./n));
		return ans;
	}

}