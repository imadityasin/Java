//SINGLE LEVEL INHERITANCE

//Access the parent class using "super";

// Create a class Employee with a method work() that prints "Employee works".
// Create a class Manager that overrides work() and uses super.work() in the overridden method.

package inheritance;

class Employee {
    void work() {
        System.out.println("Employee Works");
    }
}

class Manager extends Employee {
    @Override
    void work() {
        super.work();
        System.out.println("Hello");
    }
}

public class Program_04 {
    public static void main(String[] args) {
        Manager qw=new Manager();
        qw.work();
    }
}


