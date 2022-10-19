package oops.abstraction;

public  class Demo1 {
    public static void main(String[] args) {
//        MessageService messageService = new MessageService();
        MessageService messageService = new MessageServiceImpl();
        System.out.println(messageService.instanceVariable);
        System.out.println(MessageService.staticVariable);
        messageService.m1();
        MessageService.m2();


    }

//    abstract void m1();
}
