package Abstraction;

// Abstract class
abstract class AnimalRule4 {
    abstract void sound();
}

// Child class
class Dog4 extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

// Main class (ONLY public class)
public class Abstraction_rule_no4 {
    public static void main(String[] args) {


        Animal a = new Dog();   //  Allowed
        a.sound();
    }
}
