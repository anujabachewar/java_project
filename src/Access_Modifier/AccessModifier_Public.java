package Access_Modifier;

// Public class (file name should be AccessModifier_Public.java)
public class AccessModifier_Public {
    public String name = "PublicName";

    public void showName() {
        System.out.println(name);
    }

    public static void main(String[] args) {
        // Creating object of the public class
        AccessModifier_Public obj = new AccessModifier_Public();
        obj.showName();              // allowed anywhere
        System.out.println(obj.name); // allowed anywhere
    }
}
