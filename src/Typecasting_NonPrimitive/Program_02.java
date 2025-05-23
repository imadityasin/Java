// Exercise 2: Accessing Subclass Members
// Use the same Dog and Animal example.

// Task:
// Add a method void fetch() in Dog class
// Upcast Dog object to Animal
// Try to call fetch() on the upcasted object
// Observe and explain the result

package Typecasting_NonPrimitive;
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal{
    void sound() {
        System.out.println("Dog barks");
    }

    void fetch() {
        System.out.println("Dog fetches the ball");
    }
}
public class Program_02 {
    public static void main(String[] args) {
        Animal a;

        Dog d=new Dog();

        a=d;    //Upcasting

        a.sound();      // ✅ OK: method is defined in Animal (overridden in Dog)

        // a.fetch();        ❌ ERROR: fetch() is not in Animal

    }
}
