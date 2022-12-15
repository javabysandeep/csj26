package multithreading;

import java.util.function.Predicate;

public class FunctionalInterfaceDemos {
    public static void main(String[] args) {
        Predicate<Integer> even = integer -> integer % 2 == 0;
        Predicate<Integer> odd = integer -> integer % 2 != 0;

        System.out.println("is even " + even.test(10));
        System.out.println("is even " + even.test(11));
        System.out.println("is odd " + odd.test(10));
        System.out.println("is odd " + odd.test(11));
    }
}
