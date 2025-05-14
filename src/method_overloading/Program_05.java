//2. Area Calculator
//Create a class AreaCalculator with overloaded methods:
//
//area(int side) – returns area of a square.
//
//area(int length, int breadth) – returns area of a rectangle.
//
//area(double radius) – returns area of a circle (use π = 3.14).

package method_overloading;

public class Program_05 {

	public static void area(int side) {
		int s=side*side;
		System.out.println("Area of Square = "+s);
	}
	
	public static void area(int length, int breadth) {
		int rec=length*breadth;
		System.out.println("Area of Rectangle = "+rec);
	}
	
	public static void area(double radius) {
		double r=radius*radius*3.14;
		System.out.println("Radius is = "+r);
	}
	
	public static void main(String[] args) {
		area(5);
		area(5,10);
		area(3.4);
	}
}
