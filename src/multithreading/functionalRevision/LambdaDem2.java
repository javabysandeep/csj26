package multithreading.functionalRevision;

import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaDem2 {
    public static void main(String[] args) {

        //lambda expression is used to implement functional interface(SAM)
        Predicate<Integer> predicate = (integer)-> integer%2==0;
        System.out.println(predicate.test(10));

        Predicate<String> stringPredicate = (string)->string.startsWith("a");
        System.out.println(stringPredicate.test("xyz"));

        Function<String, Integer> function = (stringInput)->stringInput.length();
        System.out.println(function.apply("cyber"));



    }
}
