package exceptionHanlding;

public class Demo14 {
    public static void main(String[] args) {
        try {
            System.out.println("try");
            try {
                System.out.println(10 / 0);
            } catch (ArithmeticException ae) {
                System.out.println("inner catch");
            } finally {
                System.out.println("inner finally");
            }
        } catch (ArithmeticException ae) {
            System.out.println("catch");
        } finally {
            System.out.println("finally");
        }
        System.out.println("rest of the main");
    }
}
