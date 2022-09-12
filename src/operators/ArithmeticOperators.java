package operators;

public class ArithmeticOperators {
    public static void main(String[] args) {
        int number1 = 100;
        int number2 = 10;
        System.out.println(number1 + number2);//110
        System.out.println(number1 - number2);//90
        System.out.println(number1 * number2);//1000
        System.out.println(number1 / number2);//10
        System.out.println(number1 % number2);//0

        System.out.println(10 / 1);//10
        System.out.println(1 / 10);//0

        System.out.println(10 % 1);//0
        System.out.println(1 % 10);//1

        System.out.println("hello"+1);//hello1
        System.out.println(10+20);//mathematical add : 30
        System.out.println(10+20+30+"A"+"B"+30);//60AB30
        System.out.println("A"+"A");//AA
        System.out.println('A'+'A');//130
        System.out.println('A'+30+"A"+"A");//95AA
        System.out.println('A'+"A");//AA
//        System.out.println(true+true);//CTE
        int output = 'A' + 'B';
        int a = 10;
        int b = 10;
        int i = a + b;
        long longValue = 100l;
        long outputLong = i + longValue;
        float floatValue = 10.0f;
        float floatOuput = longValue + floatValue;
        double  doubleVal = 100.5d;
        char ch = 'A';
        double doubleChar = ch + doubleVal;
        double doubleOutput = doubleVal + a;
    }
}
