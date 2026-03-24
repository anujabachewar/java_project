package Access_Modifier;
class DefaultExample {
    String name = "DefaultName"; // default access

    void showName() {
        System.out.println(name);
    }
}

public class AccessModifier_Default {
    public static void main(String[] args) {
        DefaultExample obj = new DefaultExample();
        obj.showName();  //  allowed
    }
}
