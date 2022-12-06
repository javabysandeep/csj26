package exceptionHanlding;

public class InvalidDivisorException extends RuntimeException {
    public InvalidDivisorException() {
        super();
    }

    public InvalidDivisorException(String message) {
        super(message);
    }
}
