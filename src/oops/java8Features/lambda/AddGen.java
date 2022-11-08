package oops.java8Features.lambda;

@FunctionalInterface
public interface AddGen<X> {
    X add(X number1, X number2);
}
