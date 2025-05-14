// WAJP to reverse string 

package method_overloading;
import java.util.Scanner;

public class Program_02 {
    public static void m1(String name) {
        char ch;
        String reverseString ="";

        for(int i=0;i<name.length();i++) {
            ch = name.charAt(i);
            reverseString = ch + reverseString ;
        }
        System.out.println("Orignal String is = "+name);
        System.out.println("Reverse String is = "+reverseString);   
    }

    public static void m1(String name, int a) {
        StringBuilder yup=new StringBuilder(name);

        System.out.println("Orignal Name : "+name);
        System.out.println("After Reverse : "+yup.reverse());
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a String to reverse : ");
        String name=sc.nextLine();

        System.out.println("REVERSING STRING USING CUSTOM FUNCTION");
        m1(name);
        System.out.println("REVERSING STRING USING BUILT-IN FUNCTION");
        m1(name,3);

    }
}
