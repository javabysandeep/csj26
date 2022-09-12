package operators;

public class ConditionalOperator {
    public static void main(String[] args) {
        String output = (false) ? "Its true" : "its false";
        System.out.println(output);

        int age = 25;
        System.out.println(
                isEligible(age)
                        ? "You are eligible to vote"
                        : "You are a kid now. grow up!");
        System.out.println(10 + 20);
        System.out.println((4 > 3) ? "string" : 3);

    }

    private static boolean isEligible(int age) {
        return age > 18;
    }
}
