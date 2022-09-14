package controlStatements;

import java.util.Scanner;

public class SeondMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the three numbers");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        int max = 0;
        int secondMax = 0;
        //max
        if (number1 > number2 && number1 > number3) {
            max = number1;
        } else if (number2 > number1 && number2 > number3) {
            max = number2;
        } else {
            max = number3;
        }




        System.out.println("Max " + max);
        System.out.println("Second Max " + secondMax);
    }
}
