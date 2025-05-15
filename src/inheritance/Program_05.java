//SINGLE LEVEL INHERITANCE

// Problem:
// Create a class Calculator with a method add(int a, int b) that returns the sum.
// Create a class AdvancedCalculator that inherits it and adds a method power(int base, int exp) to calculate base^exp.

package inheritance;

class Calculator {
    int add(int a, int b) {
        System.out.println("A + B = "+ a+b);
        return a+b;
    }
}

class AdvancedCalculator extends Calculator {
    void power(int base, int exp) {
        
    }
}

public class Program_05 {
    public static void main(String[] args) {
        
    }
}
