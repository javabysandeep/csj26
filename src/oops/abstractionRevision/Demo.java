package oops.abstractionRevision;

public class Demo {
    //abstract void sendMessage(String message);
    public static void main(String[] args) {
        MessageService messageService = new MessageServiceImpl();
        messageService.m1();
        messageService.sendMessage("hello");
    }
}
abstract class MessageService {
    MessageService(){
        System.out.println("abstract class constructor");
    }
    abstract void sendMessage(String message);
    void m1(){
        System.out.println("instance method from abstract class");
    }
}
class MessageServiceImpl extends MessageService{
    @Override
    void sendMessage(String message) {
        System.out.println("Sending message");
    }
}
