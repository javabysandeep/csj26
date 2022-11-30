package stringHandling;

public class Demo07compareTo {
    public static void main(String[] args) {
        String str1 = "a";
        String str2 = "A";

        //compareTo method returns integer value
        // It compares the string based on unicode/ascii value
        // it will return zero when strings are equal
        //positive : when the first string is bigger than compared to second
        //negative : when the second string is bigger than compared to first

        System.out.println(str1.compareTo(str2));


    }
}
