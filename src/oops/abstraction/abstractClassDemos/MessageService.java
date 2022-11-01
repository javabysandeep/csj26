package oops.abstraction.abstractClassDemos;

public abstract class MessageService {
    int instanceVariable = 100;
    static int staticVariable =200;
    void m1(){
        System.out.println("instance method inside the abstract class");
    }
    static void m2(){
        System.out.println("static method inside the abstract class");
    }
    {
        System.out.println("instance block inside the abstract class");
    }
    static {
        System.out.println("static block inside the abstract class");
    }
    MessageService(){
        System.out.println("abstract class constructor");
    }
    abstract void sendMessage(String message);

    abstract void sendMessage();

    public static void main(String[] args) {
        System.out.println("main method inside the abstract class");
    }
}
