package exceptionHanlding;

public class Demo11 {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        } catch (ArithmeticException e){
            System.exit(0);
            System.out.println("Catch");
        }finally {
            System.out.println("finally");
        }
        System.out.println("Rest of the code");
    }
}
