package Interface;

// Define the interface
interface Vehicle1 {
    void start();   // abstract method by default
}

// Implementing the interface
class Car implements Vehicle1 {
    // Must provide implementation for the start() method
    public void start() {
        System.out.println("Car has started.");
    }
}

public class Interface_rule_no1 {
    public static void main(String[] args) {
        Vehicle1 myCar = new Car(); // cannot instantiate Vehicle1 directly
        myCar.start();              // call the implemented method
    }
}
