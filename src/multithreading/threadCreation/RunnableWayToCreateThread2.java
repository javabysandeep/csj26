package multithreading.threadCreation;

public class RunnableWayToCreateThread2 {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("anonymous "+Thread.currentThread().getName() + " " + i);
                }
            }
        };
        Thread thread = new Thread(runnable);
        thread.setName("worker");
        thread.start();

        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
