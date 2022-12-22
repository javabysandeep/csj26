package multithreading.examples;

public class EvenOdd {
    public static void main(String[] args) {
        Runnable runnable = new RunnableImpl();
        Thread even = new Thread(runnable, "even");

        Thread odd = new Thread(() -> {
            for (int i = 1; i <= 100; i++) {
                if (i % 2 != 0) System.out.println(Thread.currentThread().getName() + " " + i);
            }
        }, "odd");
        even.start();
        odd.start();
    }
}

class RunnableImpl implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}