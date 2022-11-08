package oops.java8Features.lambda;

class NumberProcessorImpl implements NumberProcessor {
    @Override
    public int process(int number) {
        return number * number;
    }
}