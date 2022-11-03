package oops.anonymousClass;

public class Demo1 {
    public static void main(String[] args) {
        MessageService messageService = new MessageService(){
            @Override
            void sendMessage() {
                System.out.println("abstract send message");
            }
        };
        messageService.sendMessage();

        MessageServiceInterface messageServiceInterface = new MessageServiceInterface(){
                    @Override
                    public void sendMessage() {
                        System.out.println("send message with interface");
                    }
                };
        messageServiceInterface.sendMessage();
    }
}
