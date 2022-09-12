package operators;

public class MathematicalOperations {
    public static void main(String[] args) {
        int number1 = 100;
        int number2 = 10;
        System.out.println(number1 + number2);
        System.out.println(number1 - number2);
        System.out.println(number1 * number2);
        System.out.println(number1 / number2);// Q = 10
        System.out.println(number1 % number2);//    R = 0

        System.out.println(1 % 10);//R=1
        System.out.println(1 / 10);//Q=0
        System.out.println(10 % 1);//R=0
        System.out.println(10 / 1);//Q=10

        //System.out.println(10 % 0);// ArithemeticException Divide by zero
        //System.out.println(10 / 0);//ArithemeticException Divide by zero

        System.out.println(0 % 10);//0
        System.out.println(0 / 10);//0

        System.out.println(10.5 / 0);//Infinity
        System.out.println(10.5 % 0);//NaN: Not a number

        // System.out.println('A'/0);//ArithemeticException Divide by zero
        //System.out.println('A'%0);//ArithemeticException Divide by zero

        System.out.println('a' + 1); //98
        System.out.println('a' % 'A'); //97 % 65
        System.out.println('a' / 'A'); //97/65

        //arithmetic operators : +, -, *, /, % cannot be applied on boolean
//        System.out.println(true%true);//cte

        //+ : mathematical addition, string concatenation
        System.out.println("hello " + 23 + 25);//hello2325
        System.out.println(23 + 25 + "hello ");//48hello

//        System.out.println("introduction.Hello"-23);//CTE
        System.out.println(10-4);
    }
}
