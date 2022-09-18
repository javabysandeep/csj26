package controlStatements.looping;

import java.util.Scanner;

public class MultiplicationWithoutOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two number");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <=number2 ; i++) {
            sum = sum + number1;
        }
        System.out.println("Multiplication of "+number1+" and "+number2+" is "+sum);
    }
}
