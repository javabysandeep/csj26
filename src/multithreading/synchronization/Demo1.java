package multithreading.synchronization;

public class Demo1 {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Thread thread1 = new Thread(()->{
            for (int i = 1; i <=20000 ; i++) {
                counter.incrementCount();
            }
        },"thread1");
        Thread thread2 = new Thread(()->{
            for (int i = 1; i <=20000 ; i++) {
                counter.incrementCount();
            }
        },"thread2");
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Total count "+Counter.count);
    }
}
