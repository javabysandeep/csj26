package multithreading.threadExecutionPreventation;

public class Demo1 {
    public static void main(String[] args) throws InterruptedException {
        //to stop the thread execution we have three methods: sleep, join,yield

        Thread sleepingThread = new Thread(()->{
            for (int i = 0; i < 100; i++) {
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName()+i);
            }
        },"sleepingThread");
        sleepingThread.start();

        for (int i = 0; i < 100; i++) {
            Thread.sleep(2000L);
            System.out.println(Thread.currentThread().getName()+i);
        }
    }
}
