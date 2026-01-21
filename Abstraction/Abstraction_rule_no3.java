package Abstraction;

// Abstract class
abstract class AnimalRule3 {
    abstract void sound();
}

// Child class must override abstract method
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

// Main class
public class Abstraction_rule_no3 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}

