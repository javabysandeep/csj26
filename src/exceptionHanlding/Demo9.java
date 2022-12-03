package exceptionHanlding;

public class Demo9 {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        } finally {
            System.out.println("finally");
        }
        System.out.println("Rest of the code");
    }
}
