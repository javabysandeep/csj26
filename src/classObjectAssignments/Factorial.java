package classObjectAssignments;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        int factorial = Factorial.calculateFactorial(number);
        System.out.println("Factorial of " + number + " is " + factorial);
    }

    private static int calculateFactorial(int number) {
        int factorial = 1;
        if (number == 0) {
            return 1;
        }
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

}
