package multithreading.threadCreation;

public class RunnableWayToCreateThreadLambda7 {
    public static void main(String[] args) {
        new Thread(() -> System.out.println("lambda is working"), "lambda").start();
    }
}

