package Access_Modifier;
class Parent {
    protected String name = "ProtectedName";
}

class Child extends Parent {
    void display() {
        System.out.println(name); // allowed (protected)
    }
}

public class AccessModifier_Protected {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display(); // allowed
    }
}
