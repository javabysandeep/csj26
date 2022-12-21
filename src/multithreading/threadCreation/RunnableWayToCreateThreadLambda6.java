package multithreading.threadCreation;

public class RunnableWayToCreateThreadLambda6 {
    public static void main(String[] args) {
        Runnable referenceOfTypeRunnable = () -> System.out.println("lambda working "+Thread.currentThread().getName());
//        Thread thread = new Thread(referenceOfTypeRunnable,"lambda");
        Thread thread = new Thread(
                () -> System.out.println("lambda working "+Thread.currentThread().getName()),
                "lambda");
        thread.start();


    }
}

