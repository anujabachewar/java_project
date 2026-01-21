package Interface;

// Define the interface
interface Vehicle2 {
    void start();  // abstract method by default
}

// Implement the interface
class Bike implements Vehicle2 {
    // Provide implementation of the start() method
    public void start() {
        System.out.println("Bike starts");
    }
}

// Main class to demonstrate Rule 2
public class Interface_rule_no2 {
    public static void main(String[] args) {
        Vehicle2 myBike = new Bike(); // Create object of the implementing class
        myBike.start();               // Call the implemented method
    }
}
