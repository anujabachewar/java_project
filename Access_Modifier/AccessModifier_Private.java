package Access_Modifier;

// Class with private member
class PrivateExample {
    private String name = "PrivateName"; // only accessible inside this class

    // Method to access private variable
    void showName() {
        System.out.println(name); // allowed
    }
}

// Public class (file name should be AccessModifier_Private.java)
public class AccessModifier_Private {
    public static void main(String[] args) {
        // Create object of PrivateExample
        PrivateExample obj = new PrivateExample();
        obj.showName();           //  allowed, access through method
        // System.out.println(obj.name); //  Not allowed, private
    }
}
