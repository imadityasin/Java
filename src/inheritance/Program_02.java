//SINGLE LEVEL INHERITANCE

// Problem:
// Create a class Person with fields name and age, and a method displayInfo() to print them.
// Create a class Student that inherits from Person and adds a field rollNumber and a method displayStudentInfo().

package inheritance;

class Person {
    String name;
    int age;

    void displayInfo() {
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
    }
}

class Student extends Person{
    int rollNumber;

    void displayStudentInfo() {
        displayInfo();          // Call method from parent class
        System.out.println("Roll Number: " + rollNumber);
    }
}

public class Program_02 {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name = "Alice";
        s1.age=21;
        s1.rollNumber=45;

        s1.displayStudentInfo();
    }
}
