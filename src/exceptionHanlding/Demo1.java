package exceptionHanlding;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        System.out.println("Addition "+(number1+number2));
        System.out.println("Division "+(number1/number2));

        System.out.println("rest of the code ........................");
    }
}
