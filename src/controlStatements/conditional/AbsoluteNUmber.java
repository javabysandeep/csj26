package controlStatements.conditional;

import java.util.Scanner;

public class AbsoluteNUmber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        System.out.println(Math.abs(number));
    }
}
