package oops.FunctionalInterfaceDemo;

@FunctionalInterface
public interface MessageService {
    void sendMessage();
}

class MessageServiceImpl implements MessageService{
    @Override
    public void sendMessage() {
        System.out.println("send message");
    }

    public static void main(String[] args) {
        MessageService messageService = new MessageServiceImpl();
        messageService.sendMessage();

        // way 2 : anonymous class

        MessageService anon = new MessageService() {
            @Override
            public void sendMessage() {
                System.out.println("send message anonymous way");
            }
        };
        anon.sendMessage();

        //way 3: using lambda expression
        MessageService lambda = ()-> System.out.println("sending message lambda");
        lambda.sendMessage();
    }
}

