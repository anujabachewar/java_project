package ExceptionHandling;

public class MethodStack {

    static void a(){
        System.out.println("Inside a() method");
        b();
    }

    static void b(){
        System.out.println("Inside b() method");
        c();
    }

    public static void main(String[] args) {
        System.out.println("Inside main method");
        a();
    }

    static void c(){
        System.out.println("Inside c() method");
    }

}
