package exceptionHanlding;

public class Demo15Throws {
    public static void main(String[] args) {
        try {
            m1();
        }catch (ArithmeticException ae){
            System.out.println("handled in main");
        }
        System.out.println("rest of the main");
    }
    public static void m1() throws ArithmeticException{
        System.out.println("m1");
        System.out.println(10/0);
    }
}
