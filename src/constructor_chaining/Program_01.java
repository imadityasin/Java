// Create a Car class with the following constructors:
// Constructor with only model name.
// Constructor with model and price.
// Constructor with model, price, and year.
// Use constructor chaining. Avoid code duplication.

package constructor_chaining;

import java.time.Year;
import java.util.Scanner;

public class Program_01 {
    String ModelName;
    long price;
    int year;

    Program_01 (String ModelName) {
        this(ModelName,0,0);
    }

    Program_01 (String ModelName, long price) {
        this(ModelName,price,0);
    }

    Program_01 (String ModelName, long price,int year) {
        this.ModelName=ModelName;
        this.price=price;
        this.year=year;
    }

    void display() {
        System.out.println("Model Name : "+ModelName);
        System.out.println("Price : "+price);
        System.out.println("Manufacture Year : "+year);
        System.out.println("============================================");
    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        Program_01 pg1=new Program_01("Tesla");
        pg1.display();

        Program_01 pg2=new Program_01("Tesla",46845);
        pg2.display();

        Program_01 pg3=new Program_01("Tesla",45486,2025);
        pg3.display();
    }
}
