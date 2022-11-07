package oops.java8Features.lambda;

import java.util.Locale;

public class Demo {
    public static void main(String[] args) {
        // way 1: create a separate subclass & provide override
        StringProcessor stringProcessor = new StringProcessorImpl();
        System.out.println(stringProcessor.process("traditional way"));

        // way 2: anonymous class
        StringProcessor anon = new StringProcessor() {
            @Override
            public String process(String string) {
                return string.toUpperCase();
            }
        };
        System.out.println(anon.process("anonymous class"));

        // way 3 : lambda way
        StringProcessor lambda = (string)->string.toUpperCase();

        System.out.println(lambda.process("lambda expression"));
    }
}
