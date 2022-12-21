package multithreading.threadCreation;

public class RunnableWayToCreateThread3 {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("anonymous "+Thread.currentThread().getName() + " " + i);
                }
            }
        });
        thread.setName("worker");
        thread.start();

        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
