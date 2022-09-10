public class ExpressionResults {
    public static void main(String[] args) {
        byte b1 = 10;
        short s1 = 20;
        int i1 = 30;
        long l1 = 40l;
        float f1 = 50.5f;
        double d1 = 60.5d;
        char c1 = 'A';

        int output = b1 + c1;
        long output2 = b1 + l1;
        float output3 = l1 + f1;
        double output4 = d1 + c1;

        System.out.println('A'+ f1);// char+ char=int//130
        System.out.println("A"+'A');//AA
        System.out.println('A'+'A');//130

    }
}
