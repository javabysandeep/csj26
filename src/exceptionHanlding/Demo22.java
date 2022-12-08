package exceptionHanlding;

public class Demo22 {
    public static void main(String[] args) {
        try {
            System.out.println(10/1);
            System.out.println("rest of the try");
            String str = null;
            System.out.println(str.length());
        }catch (ArithmeticException ae){
            System.out.println("divide by zero");
        }catch (NullPointerException npe){
            System.out.println("npe");
        }
    }
}
