package exceptionHanlding;

public class Demo17ThrowAndThrows {
    public static void main(String[] args) {
        m1();
    }

    public static void m1() throws ArithmeticException {
        throw new ArithmeticException("divide by zero");
    }
}
