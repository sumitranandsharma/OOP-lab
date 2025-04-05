// Grandparent class
class Animal {
    void eat() {
        System.out.println("Animal eats food.");
    }
}

// Parent class
class Mammal extends Animal {
    void walk() {
        System.out.println("Mammal walks.");
    }
}

// Child class
class Dog extends Mammal {
    void bark() {
        System.out.println("Dog barks.");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();   // from Animal
        d.walk();  // from Mammal
        d.bark();  // from Dog
    }
}
