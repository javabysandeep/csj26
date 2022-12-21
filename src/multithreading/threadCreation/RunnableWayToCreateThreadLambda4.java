package multithreading.threadCreation;

public class RunnableWayToCreateThreadLambda4 {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("lamda "+Thread.currentThread().getName() + " " + i);
            }
        });
        thread.setName("worker");
        thread.start();

        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
