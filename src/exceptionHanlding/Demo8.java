package exceptionHanlding;

public class Demo8 {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }catch (ArithmeticException arithmeticException){
            System.out.println("divisor is zero");
            System.out.println(10/0);
        } finally {
            System.out.println("finally");
        }
        System.out.println("Rest of the code");
    }
}
