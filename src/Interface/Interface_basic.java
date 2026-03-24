package Interface;
interface Animal {
    void sound();
}

// Class implements interface
class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}
public class Interface_basic {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}
