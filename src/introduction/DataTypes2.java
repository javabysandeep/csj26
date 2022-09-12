package introduction;

public class DataTypes2 {
    public static void main(String[] args) {
        byte b1 = 127;
        byte b2 = 1;
        byte b3 = (byte) (b1 + b2);

        short shortValue = 100;
        int a = shortValue; // implicit type casting is done by the java compiler
        System.out.println(b3);

        char ch1 = 'A';
        char ch2 = 'B';
        char ch3 = (char)(ch1 + ch2);
        System.out.println(ch3);
        System.out.println(ch1+ch2);

    }
}
