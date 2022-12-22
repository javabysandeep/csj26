package multithreading.threadExecutionPreventation;

public class Demo3 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(()->{
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName()+" "+i);
            }
        },"thread1");
        thread1.setPriority(10);

        Thread thread2 = new Thread(()->{
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName()+" "+i);
            }
        },"thread2");
        thread2.setPriority(10);

        thread1.start();
        thread2.start();

        //yeild means give up
        // yield method will give up the execution of currently executing thead
        //  to other threads which are same or more priority

        // main thread gives the suggestion to the Thread scheduler
        // that main thead is ready to give up the execution
        // for other threads which are having same or more priority

        // it is upto the TS to take up this or not
        Thread.yield();

        //main thread job
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
}
