package Interface;

// Interface
interface AnimalRule4 {
    void sound(); // abstract method by default
}

// Class implementing the interface
class Dog4 implements AnimalRule4 {
    public void sound() {
        System.out.println("Dog barks");
    }
}

// Main class (ONLY public class)
public class Interface_rule_no4 {
    public static void main(String[] args) {

        // Interface reference pointing to an object of implementing class
        AnimalRule4 a = new Dog4(); // Allowed
        a.sound();                 // Call the method
    }
}
