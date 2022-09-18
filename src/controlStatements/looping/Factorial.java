package controlStatements.looping;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        int factorial = 1;
        if (number == 0) {
            factorial = 0;
        }
       /* for (int i = 1; i <= number; i++) {
            factorial *= i;
        }*/

        for (int i = number; i >=1 ; i--) {
            factorial *=i;
        }
        System.out.println("Factorial of "+number+" is "+factorial);


    }
}
