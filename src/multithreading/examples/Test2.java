package multithreading.examples;

import java.time.LocalDateTime;

public class Test2 {
    public static void main(String[] args) throws InterruptedException {
        Sum task1 = new Sum(1, 1000000);
        Sum task2 = new Sum(1000001, 2000000);
        LocalDateTime start = LocalDateTime.now();

        Thread thread1 = new Thread(()->task1.add(),"first");
        Thread thread2 = new Thread(()->task2.add(),"second");

        thread1.start();
        thread2.start();

        //main thread should wait for thread1 and thread2 complete
       /* thread1.join();
        thread2.join();*/

        System.out.println("Total count " + (task1.counter + task2.counter));
        LocalDateTime end = LocalDateTime.now();
        System.out.println("Completed and time taken " + (end.getSecond() - start.getSecond()));

    }
}
