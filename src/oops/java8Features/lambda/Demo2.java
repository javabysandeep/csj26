package oops.java8Features.lambda;

public class Demo2 {
    public static void main(String[] args) {
       Addition way1 = new AddImpl();
        System.out.println(way1.add(10,20));
        Addition way2 = new Addition() {
            @Override
            public int add(int number1, int number2) {
                return number1+number2;
            }
        };
        System.out.println(way2.add(10,20));

        Addition way3 = ( number1, number2)-> number1+number2;
        System.out.println(way3.add(10,20));
    }
}

