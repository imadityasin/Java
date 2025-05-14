// Overload a method multiply:
// multiply(int a, int b)
// multiply(double a, double b)

package method_overloading;

import java.util.Scanner;

public class Program_01 {
    // Method 
    public static void multiply(int a , int b) {
        int d=a*b;
        System.out.println("Multiplication between int values: "+d);
    }

    // Method Overloading 
    public static void multiply(double a, double b) {
        double t=a*b;
        System.out.println("Multiplication between double values : "+t);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter value in A: ");
        int a=sc.nextInt();
        System.out.println("Enter value in B: ");
        int b=sc.nextInt();
        System.out.println("Enter  value in C: ");
        int c=sc.nextInt();

        multiply(5,10);
        multiply(5.0,3.5);
    }
}