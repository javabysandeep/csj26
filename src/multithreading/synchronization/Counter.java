package multithreading.synchronization;

public class Counter {
    static int count = 0;

    public  void incrementCount() {
        synchronized (this){
            count++;
        }
        System.out.println(Thread.currentThread().getName()+" "+count);
    }
}
