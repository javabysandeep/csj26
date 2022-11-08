package oops.java8Features.lambda;

public class AddGenTest {
    public static void main(String[] args) {
      AddGen<String> addGen = new AddGenImpl();
        System.out.println(addGen.add("hello","abc"));

        AddGen<Float> floatAddGen = (num1, num2)->num1+num2;
        System.out.println(floatAddGen.add(10.5f,20.5f));

        AddGen<String> stringAddGen = (num1, num2)->num1+num2;
        System.out.println(stringAddGen.add("cyber","success"));
    }
}
