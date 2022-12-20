package multithreading.functionalRevision;

import java.util.function.Predicate;

public class StringTest {
    public static void main(String[] args) {
         StringProcessor stringProcessor =  str->str.equals(str.toUpperCase());
        System.out.println(stringProcessor.isUpperCase("abc"));
        System.out.println(stringProcessor.isUpperCase("PQR"));

        System.out.println("using predicate");
        Predicate<String> predicate = str->str.equals(str.toUpperCase());
        System.out.println(predicate.test("abc"));
        System.out.println(predicate.test("PQR"));
    }
}
