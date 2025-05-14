package method_overloading;

public class Program_04 {
//	Created Method
	public static void add(int a, int b) {
		int c=a+b;
		System.out.println("Addition of Two Numbers : a+b = "+c);
	}
	
//	Overloading add method (Differ in No. of FA)
	public static void add(int a, int b, int c) {
		int d=a+b+c;
		System.out.println("Addition of Three Numbers : a+b+c = "+d);
	}
	
//	overloading add method (Differ in Type of FA)
	public static void add(double a, int b) {
		double c=a+b;
		System.out.println("Addition of Two Numbers : a+b = "+c);
	}
	
//	overloading add method (Differ in Order of FA)
	public static void add(int a, double b) {
		double c=a+b;
		System.out.println("Addition of Two Numbers : a+b = "+c);
	}
	
	
	public static void main(String[] args) {
		add(5,6);
		add(5,6,7);
		add(5.0,6);
		add(50,4.3);
	}
}