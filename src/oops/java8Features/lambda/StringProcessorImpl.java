package oops.java8Features.lambda;

class StringProcessorImpl implements StringProcessor{
    @Override
    public String process(String string) {
        return string.toUpperCase();
    }
}