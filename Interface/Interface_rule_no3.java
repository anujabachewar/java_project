package Interface;

// Define the interface
interface AnimalRule3 {
    void sound(); // abstract method by default
}

// Implement the interface
class Cat3 implements AnimalRule3 {
    // Provide implementation of the sound() method
    public void sound() {
        System.out.println("Cat meows");
    }
}

// Main class to demonstrate Rule 3
public class Interface_rule_no3 {
    public static void main(String[] args) {
        AnimalRule3 myCat = new Cat3(); // Allowed: interface reference, object of implementing class
        myCat.sound();                   // Call the implemented method
    }
}
