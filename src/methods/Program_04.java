// Write a method that returns the maximum of three numbers.
package methods;

import java.util.Scanner;

public class Program_04 {
    public static int m1(int a, int b, int c) {
        if(a>b && a>c) {
            System.out.println("A is Greater....!! = "+a);
        }
        else if (b>a && b>c) {
            System.out.println("B is Greater.....!! = "+b);
        }
        else if(c>a && c>b) {
            System.out.println("C is Greater....!! = "+c);
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Number: A :");
        int a=sc.nextInt();
        System.out.println("Enter Number: B :");
        int b=sc.nextInt();
        System.out.println("Enter Number: C :");
        int c=sc.nextInt();

        m1(a,b,c);
    }
}
