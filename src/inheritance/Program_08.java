//MULTI-LEVEL INHERITANCE

// Problem:
// Create class Vehicle with a constructor that takes String brand and prints "Vehicle: <brand>".

// Create class Car that extends Vehicle, takes String brand and String model, and prints "Car: <model>".

// Create class ElectricCar that extends Car, takes brand, model, and batteryCapacity, and prints "Battery: <batteryCapacity> kWh".

package inheritance;

class Vehicle {
    Vehicle(String brand) {
        System.out.println("Vehicle Brand is : "+brand);
    }    
}

class Car extends Vehicle {
    
}

public class Program_08 {
    public static void main(String[] args) {
        
    }
}
