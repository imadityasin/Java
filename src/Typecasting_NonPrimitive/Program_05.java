// Exercise 5: Upcasting with Constructors
// Create:

// Class Vehicle with a constructor printing "Vehicle created"

// Class Car extends Vehicle and has a constructor printing "Car created"

// Task:

// Create a Car object using upcasting:
// Vehicle v = new Car();
// Observe the output and explain which constructors are called and why


package Typecasting_NonPrimitive;

class Vehicle {
    Vehicle() {
        System.out.println("Vehicle Created");
    }
}

class Car extends Vehicle {
    Car() {
        System.out.println("Car Created");
    }
}

public class Program_05 {
    public static void main(String[] args) {
        Vehicle v=new Car();     //Yehi hai upcasting (subclass object ko superclass reference me rakhna)
    }
}
