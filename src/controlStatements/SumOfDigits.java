package controlStatements;

public class SumOfDigits {
    public static void main(String[] args) {
        int number = 12345;
        //output 1 + 4 = 5
        int sum = 0;

        int digit = number % 10;//5
        number = number / 10; // number = 1234

        digit = number%10;//4
        sum = sum + digit;

        digit = number%10; // 1234%10= 4
        number = number /10; // number = 123

        digit = number%10; // 123%10= 3
        number = number /10; // number = 123/10 = 12

        digit = number%10; // 12%10= 2
        number = number /10; // number = 12/10 = 1

         digit = number%10; // 1%10= 1
        number = number /10; // number = 1/10 = 0

        sum = sum + digit;
        System.out.println("Sum "+sum);

       /* System.out.println(12345%10);//5
        System.out.println(12345/10);//1234

        System.out.println(1234%10);//4
        System.out.println(1234/10);//123

        System.out.println(123%10);//3
        System.out.println(123/10);//12

        System.out.println(12%10);//2
        System.out.println(12/10);//1

         System.out.println(1%10);//1
        System.out.println(1/10);//0*/
    }
}
