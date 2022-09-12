package controlStatements;

public class Divisibility5 {
    public static void main(String[] args) {
        int number = 25;
        System.out.println(26 % 5);//1
        System.out.println(10 % 1);//0
        System.out.println(10 / 1);//10
        System.out.println(1 / 10);//0
        System.out.println(1 % 10);//1
        if (number % 5 == 0) {
            System.out.println("Divisible by 5");
        } else {
            System.out.println("Not divisible by 5");
        }
    }
}
