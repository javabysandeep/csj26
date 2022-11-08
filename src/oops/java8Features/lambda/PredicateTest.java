package oops.java8Features.lambda;

import java.util.function.Predicate;

public class PredicateTest {
    public static void main(String[] args) {
        Predicate<Integer> evenCheck = (input) -> input%2==0;
        System.out.println(evenCheck.test(21));


        Predicate<String> isUpperCase = (string)-> string.equals(string.toUpperCase());
        System.out.println(isUpperCase.test("abc"));
    }
}
