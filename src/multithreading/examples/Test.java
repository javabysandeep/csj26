package multithreading.examples;

import java.time.LocalDateTime;

public class Test {
    public static void main(String[] args) {
        Sum task1 = new Sum(1, 1000000);
        Sum task2 = new Sum(1000001, 2000000);
        LocalDateTime start = LocalDateTime.now();
        task1.add();
        task2.add();
        System.out.println("Total count " + (task1.counter + task2.counter));
        LocalDateTime end = LocalDateTime.now();
        System.out.println("Completed and time taken " + (end.getSecond() - start.getSecond()));

    }
}
