package multithreading.threadExecutionPreventation;

public class Demo2 {
    public static void main(String[] args) throws InterruptedException {
        Thread custom = new Thread(()->{
            try {
                Thread.sleep(2000L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            for (int i = 0; i < 100; i++) {

                System.out.println(Thread.currentThread().getName()+" "+i);
            }
        },"custom");
        custom.start();


        custom.join(100000L);//main thread will wait for custom thread to complete the execution

        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
}
