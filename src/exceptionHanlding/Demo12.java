package exceptionHanlding;

public class Demo12 {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }catch (ArithmeticException ae){
            System.out.println("Catch");
            System.out.println(10/0);
        }
        System.out.println("rest of the code");
    }
}
