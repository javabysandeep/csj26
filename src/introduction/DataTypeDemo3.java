package introduction;

public class DataTypeDemo3 {
    public static void main(String[] args) {
        byte b1 = (byte) 130;// 1byte, -128 to 127
        System.out.println(b1);//
        short s1 = (short) 32769;
        System.out.println(s1);
        int i1 = 214748364;
        System.out.println(i1);

        long l1 = 9223372036854775807l;

        char ch1 = 'A';
        char ch2 = 65;
        System.out.println(ch1);
        System.out.println(ch2);

        boolean boolValue = true;
        System.out.println(boolValue);

        float fl = 100.456f;
        System.out.println(fl);

        double dl = 123456.244115d;
        System.out.println(dl);

        int number = 131;
        byte b3 = (byte) number; //
        System.out.println(b3);

    }
}
