package oops.abstraction.abstractClassDemos;

public class MessageServiceImpl extends MessageService {

    @Override
    void sendMessage(String message) {
        System.out.println("message implemented");
    }

    @Override
    void sendMessage() {

    }
}
