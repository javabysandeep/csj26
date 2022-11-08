package oops.java8Features.lambda;

public class NumberProcessTest {
    public static void main(String[] args) {
        //way 1: create separate subclass
        NumberProcessor square = new NumberProcessorImpl();
        System.out.println("square " + square.process(10));

        //way 2: create anonymous class
        NumberProcessor cube = new NumberProcessor() {
            @Override
            public int process(int number) {
                return number * number * number;
            }
        };
        System.out.println("cube " + cube.process(10));

        //way 3: use lambda expression
        NumberProcessor lambda = ( number) ->
                number * number * number * number;
        System.out.println("power of 4 is "+lambda.process(10));

    }
}
