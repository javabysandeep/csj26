package multithreading.functionalRevision;

import java.time.LocalDateTime;

public class SumDemo {
    public static void main(String[] args) {
        SumOfAddition s1 = new SumOfAddition(1, Integer.MAX_VALUE / 2);
        SumOfAddition s2 = new SumOfAddition(Integer.MAX_VALUE / 2 + 1, Integer.MAX_VALUE);
        LocalDateTime startTime = LocalDateTime.now();
        System.out.println("Counting started " + startTime);

        s1.add();
        s2.add();

        LocalDateTime endTime = LocalDateTime.now();
        System.out.println("Counting completed " + endTime);
        System.out.println(s1.counter + s2.counter);

    }
}
