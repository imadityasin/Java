//MULTI-LEVEL INHERITANCE

// Problem:
// Class Person has fields name and age, and method displayPerson().
// Class Employee extends Person, adds employeeId, and method displayEmployee().
// Class Manager extends Employee, adds department, and method displayManager().


package inheritance;

class Person {
    String name;
    int age;
    void displayPerson() {
        System.out.println("Employee Name : "+name);
        System.out.println("Employee Age : "+age);
        }
    }

class Employee extends Person {
        int employeeId;

        void displayEmployee() {
            System.out.println("Employee ID : "+employeeId);
        }
    }

class Manager extends Employee {
    String department;

    void displayManager() {
        System.out.println("Department is : "+department);
    }

}

public class Program_06 {

    public static void main(String[] args) {
        Manager mg=new Manager();
        
        //Assigning Values
        mg.name="Aditya Singh";
        mg.age=67;
        mg.department="Finance";
        mg.employeeId=50067;

        //Calling Methods
        mg.displayPerson();
        mg.displayEmployee();
        mg.displayManager();
    }
}
