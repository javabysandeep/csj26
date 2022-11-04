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
@FunctionalInterface//SAM
interface A{
    void m1();
//    void m46();
    default void m2(){}
    default void m5(){}
    default void m6(){}
    default void m7(){}
    default void m8(){}
    default void m9(){}
    static void m3(){}
    static void m10(){}
//    void m2();
}






