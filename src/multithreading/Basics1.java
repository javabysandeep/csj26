package multithreading;

public class Basics1 {
    public static void main(String[] args) {
        //interface, abstract class, anonymous class, lambda expression, function interface
        //lambda expression is not for abstract class. it is only for FI
        MessageService messageService1 = new MessageServiceImpl();
        messageService1.m1();

        MessageService  messageService = new MessageService() {
            @Override
            void m1() {
                System.out.println("anonymous class");
            }
        };
        messageService.m1();

    }
}


