package oops.polymorphism;

public class MessageServiceImpl extends MessageService{

    @Override
    public void sendMessage(String message) {
        System.out.println("Method override");
    }
}
//default, protected, public
//protected, public
//public