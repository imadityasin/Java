package Typecasting_NonPrimitive;

class Animal{
    void fetch() {
        System.out.println("Hello All Animals");
    }
}

class Cat extends Animal{
    void sound() {
        System.out.println("Meow Meow");
    }
}

public class Program_06 {
    public static void main(String[] args) {
        Animal a;
        Cat c=new Cat();
        a=c;                //Upcasting
        a.fetch();

        System.out.println("-------------------------------------");

        // Safe Downcasting
        Animal a1 = new Cat();  // Upcasting
        Cat c1 = (Cat) a1;      // Downcasting (safe)
        c1.sound();             // Access subclass method
    }   
}
