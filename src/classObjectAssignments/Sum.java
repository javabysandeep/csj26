package classObjectAssignments;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        System.out.println("Addition of two numbers " + Sum.addition(number1, number2));
        System.out.println("Multiplication of two numbers " + Sum.multiply(number1, number2));

    }

    private static int addition(int number1, int number2) {
        return number1 + number2;
    }

    private static int multiply(int number1, int number2) {
        return number1 * number2;
    }


}
