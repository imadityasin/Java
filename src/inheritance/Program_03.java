//SINGLE LEVEL INHERITANCE

// Problem:
// Create a class Vehicle with a constructor to initialize brand.
// Create a class Car that inherits Vehicle and adds a constructor to initialize model.

package inheritance;

//Parent Class
class Vehicle {
    String brand;

    //Constructor for vehicle.
    public Vehicle(String brand) {
        this.brand=brand;
    }

    void displayBrand() {
        System.out.println("Brand: " + brand);
    }
}

//Child Class
class Car extends Vehicle {
    String model;
}
public class Program_03 {
    public static void main(String[] args) {
        
    }
}
