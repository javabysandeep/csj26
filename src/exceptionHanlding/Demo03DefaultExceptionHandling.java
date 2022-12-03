package exceptionHanlding;
import java.lang.*;
public class Demo03DefaultExceptionHandling {
    public static void main(String[] args) {
        System.out.println(10/0);
//        throw  new ArithmeticException("divide by zero");
        System.out.println("rest of main");
    }
}
