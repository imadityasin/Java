// Exercise 2: Student Information
// Problem: Create a Student class with these constructors:
// Constructor with no arguments.
// Constructor with only name.
// Constructor with name and roll number.
// Constructor with name, roll number, and marks.
// Add a method to display student details.

package constructor_overloading;

public class Program_01 {
    String name;
    int Roll;
    double Marks;

    public Program_01() {
        System.out.println("Welcome to K.R. MANGALAM WORLD SCHOOL");
    }

    public Program_01(String Name) {
        this.name=Name;
    }
    
    public Program_01(String Name, int roll) {
        this.name=Name;
        this.Roll=roll;
    }

    public Program_01(String Name, int roll, double marks) {
        this.name=Name;
        this.Roll=roll;
        this.Marks=marks;
    }

    void show() {
        System.out.println("Name : "+name);
        System.out.println("Roll : "+Roll);
        System.out.println("Marks : "+Marks);
    }

    public static void main(String[] args) {
        Program_01 s1 = new Program_01(); // No-arg constructor
        s1.show();

        System.out.println("----------------------");

        Program_01 s2 = new Program_01("Alice"); // Constructor with name
        s2.show();

        System.out.println("----------------------");

        Program_01 s3 = new Program_01("Bob", 101); // Constructor with name and roll
        s3.show();

        System.out.println("----------------------");

        Program_01 s4 = new Program_01("Charlie", 102, 88.5); // Constructor with all fields
        s4.show();
    }
}