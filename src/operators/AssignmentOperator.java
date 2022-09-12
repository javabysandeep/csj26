package operators;

public class AssignmentOperator {
    public static void main(String[] args) {
        int a = 50;
        a = 30;// right operand is a direct value
//        10=10;
        a = 5 * 5;// right operand is a expression
        int b = a;// right operand is a variable
        int c = method();//10
        System.out.println(a);//25
        System.out.println(b);//25
        System.out.println(c);//10
        System.out.println(c=30);//30
    }

    private static int method() {
        return 10;
    }
}
