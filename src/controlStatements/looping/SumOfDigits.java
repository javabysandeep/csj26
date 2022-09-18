package controlStatements.looping;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number ");
        int number = scanner.nextInt();
        int sum = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            sum = sum + lastDigit;
            number = number / 10;
        }
        System.out.println("Sum of digits " + sum);
    }
}
