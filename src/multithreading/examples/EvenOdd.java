package multithreading.examples;

public class EvenOdd {
    public static void main(String[] args) {
        Thread even = new Thread(() -> {
            for (int i = 1; i <= 100; i++) {
                if (i % 2 == 0) System.out.println(Thread.currentThread().getName() + " " + i);
            }
        }, "even");

        Thread odd = new Thread(() -> {
            for (int i = 1; i <= 100; i++) {
                if (i % 2 != 0) System.out.println(Thread.currentThread().getName() + " " + i);
            }
        }, "odd");
        even.start();
        odd.start();
    }
}
