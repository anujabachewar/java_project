package ExceptionHandling;

public class IntroToException {

    void divide(int a, int b){
        int result = a/b;
        System.out.println("result is " +  result);
    }
    public static void main(String[] args) {
        System.out.println("Inside main method");
        IntroToException obj = new IntroToException();
        obj.divide(100, 0);
        obj.test();
    }

    void test(){
        System.out.println("This is test method");
    }
}
