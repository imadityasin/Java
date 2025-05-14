// Create a class Calculator with overloaded methods:
// add(int a, int b)

// add(double a, double b)

// add(String a, String b) // concatenation

package method_overloading;

public class Program_03 {
    public static int add(int a, int b) {
        System.out.println("Adding of Two Integer number is :"+ a+b);
        return 0;
    }

    public static double add(double a, double b) {
        double c=a+b;
        System.out.println("Adding of Two Double number is :"+c);

        return 0;
    }

    public static String add(String a, String b) {
        System.out.println("Adding of Two String Values is :" +a+b);
        return a+b;
    }

    public static void main(String[] args) {
        add(5, 6);
        add(6.8, 8.9);
        add("Aditya", " Singh");
    }
}
