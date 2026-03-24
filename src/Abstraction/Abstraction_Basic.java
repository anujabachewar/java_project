package Abstraction;
// Abstract class
abstract class Vehicle {
    abstract void start();   // abstract method

    void stop() {            // normal method
        System.out.println("Vehicle stopped");
    }
}

// Child class
class Bike extends Vehicle {
    void start() {
        System.out.println("Bike starts with key");
    }
}

public class Abstraction_Basic {
    public static void main(String[] args) {
        Bike b = new Bike();
        b.start();
        b.stop();
    }
}
