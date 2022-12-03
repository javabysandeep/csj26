package exceptionHanlding;

public class Demo6 {
    public static void main(String[] args) {
        try {
            System.out.println(10/1);
            System.out.println("rest of the try");
        }
//        System.out.println("independent statements are not allowed");
        catch (ArithmeticException arithmeticException){
            System.out.println("divisor is zero");
            System.out.println(10/0);
        }
        System.out.println("rest of the code");
    }
}
