package oops.java8Features.lambda;

public class AddGenImpl implements AddGen<String>{
    @Override
    public String add(String number1, String number2) {
        return number1+number2;
    }
}
