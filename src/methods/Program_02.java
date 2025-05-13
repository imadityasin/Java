// Write a method that takes two integers and returns their sum.
package methods;

import java.util.Scanner;

public class Program_02 { 

    // Parameterized Methods 
    public static int m1(int a, int b) {
        System.out.println(a+b);
        return a+b;
    }

    // Main Method
    // Calling Method
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Value in A");
        int a=sc.nextInt();

        System.out.println("Enter Value in B");
        int b=sc.nextInt();

        m1(a,b);        // Calling Statement
    }
}
