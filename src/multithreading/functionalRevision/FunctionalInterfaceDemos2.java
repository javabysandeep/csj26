package multithreading.functionalRevision;

import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalInterfaceDemos2 {
    public static void main(String[] args) {
        Function<Integer, Integer> square = integer -> integer*integer;
        Function<Integer, Integer> cube = integer -> integer*integer*integer;

        processNumber(square);
        processNumber(cube);
    }

    private static void processNumber(Function<Integer, Integer> function) {
        System.out.println(function.apply(10));
    }
}
