package exceptionHanlding;

public class Demo16CheckExceptionThrows {
    public static void main(String[] args)  {
        try {
            Class.forName("exceptionHanlding.Demo1111");
        } catch (ClassNotFoundException e) {
            System.out.println("invalid class name");
        }
        System.out.println("rest of the code");
    }

}
class Demo{
    static {
        System.out.println("demo class loaded into the memory");
    }
}
