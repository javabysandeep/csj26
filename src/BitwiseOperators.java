public class BitwiseOperators {
    public static void main(String[] args) {
        System.out.println(4 & 5);//4
        System.out.println(4 | 5);//5
        System.out.println(4 ^ 5);//1
        System.out.println(4 << 1);//8
        System.out.println(4 << 2);//16
        System.out.println(4 << 3);//32
        System.out.println(4 << 4);//64
        System.out.println(4 << 5);//128
        System.out.println(4 << 6);//256
        System.out.println(4 << 60);//

        System.out.println(4 >> 1);//2
        System.out.println(4 >> 2);//1
        System.out.println(4 >> 3);//0

        System.out.println(~4);// number + 1 and change the sign : -5
        System.out.println(~5);
        System.out.println(~6);
        System.out.println(~-6);// -6+1 = -5  change the sign 5 --> one's complement, 2's complement


    }
}
