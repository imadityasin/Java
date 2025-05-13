// Write a method that checks if a number is even or odd. 

package methods;

import java.util.Scanner;

public class Program_03 {
    // Method
    public static void m1(int a ) {
        System.out.println("METHOD WILL CHECK NUMBER IS ODD OR EVEN");

        if(a%2==0) {
            System.out.println(a+" : Even Number");
        }
        else {
            System.out.println(a+" : Odd Number");
        }
    }

    // Main Method 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int num=sc.nextInt();
        m1(num);
    }
}
