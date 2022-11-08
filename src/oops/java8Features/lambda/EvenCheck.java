package oops.java8Features.lambda;

@FunctionalInterface
public interface EvenCheck {
    String test(int number);

    public static void main(String[] args) {
        /*EvenCheck evenCheck = (int number) -> {
            if (number % 2 == 0) {
                return number + " is even";
            } else {
                return number + " is odd";
            }
        };*/
        EvenCheck evenCheck = (number) -> (number % 2 == 0) ? number + " is even" : number + " is odd";
        System.out.println(evenCheck.test(10));

    }
}
