// Create a class Animal with a method makeSound() that prints "Animal makes a sound".
// Create a class Dog that inherits from Animal and overrides the makeSound() method to print "Dog barks".

package inheritance;

<<<<<<< HEAD
class Example {
    System.out.println("Hello");
}

class Program_01 extends Example {
   public static void helloAll() {
    System.out.println("Hello");
   }

    public static void main(String[] args) {
        
=======
class Animal {
    public static void makeSound() {
        System.out.println("Animal Makes a Sound");
>>>>>>> 82b1963e26942e8539af80ce18f0d3fd30da563f
    }
}

class Dog extends Animal {
    public static void makeSound() {
        System.out.println("Dog Barks");
    }
}

public class Program_01 {
    public static void main(String[] args) {
        Animal dt=new Animal(); // Object of parent class
        dt.makeSound();         // Calls parent class method
        
        Dog dd=new Dog();   // Object of child class
        dd.makeSound();     // Calls overridden method in child class
    }
}