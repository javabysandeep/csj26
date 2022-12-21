package multithreading.threadCreation;

public class RunnableWayToCreateThread {
    public static void main(String[] args) {
        Worker worker = new Worker();
//        worker.start();//cte
//        worker.run();//thread is not created
        Thread thread = new Thread(worker);
        thread.setName("worker");
        thread.start();

        System.out.println("rest of the main");
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
