package controlStatements.looping;

import java.util.Scanner;

public class WhileDemo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int sum = 0;
        char wantToContinue = ' ';
        int counter = 0;

        while (wantToContinue != 'q') {
            System.out.println("Enter the number");
            number = scanner.nextInt();
            counter++;
            sum = sum + number;
            System.out.println("Sum is " + sum);
            System.out.println("Avg is " + sum/counter);
            System.out.println("Do you want to stop then enter q");
            wantToContinue = scanner.next().charAt(0);
        }
    }
}
