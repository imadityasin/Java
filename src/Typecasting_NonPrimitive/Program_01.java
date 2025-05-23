// Create two classes:
// Animal with a method void sound()
// Dog extends Animal, overrides sound() method

// Task:
// Create a Dog object
// Upcast it to Animal

// Call the sound() method
package Typecasting_NonPrimitive;
class Animal {
    void sound() {
        System.out.println("Animals");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog Barks");
    }
}

public class Program_01 {
    public static void main(String[] args) {

        // Upcasting means storing a Dog object into a Animal reference — this is valid 
        // because Dog is-a Animal.
        Animal a;
        Dog d=new Dog();
        a=d;

        a.sound();
    }
}
