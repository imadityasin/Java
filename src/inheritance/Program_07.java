// MULTI-LEVEL INHERITANCE.

// Class Animal:
// Method: eat() – prints "Animal eats".
// Class Mammal (extends Animal):
// Method: walk() – prints "Mammal walks".
// Class Dog (extends Mammal):
// Method: bark() – prints "Dog barks".
// In the main() method, create a Dog object and call all three methods.

package inheritance;

class Animal {
    void eat() {
        System.out.println("Animal Eats");
    }
}

class Mammal extends Animal {
    void walks() {
        System.out.println("Mammals Walk");
    }
}

class Dog extends Mammal {
    void barks() {
        System.out.println("Dog Barks");
    }
}

public class Program_07 {
    public static void main(String[] args) {
        //Creating refernce
        Dog d=new Dog();

        //Calling methods
        d.eat();
        d.walks();
        d.barks();
    }
}
