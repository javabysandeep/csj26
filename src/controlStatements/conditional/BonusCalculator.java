package controlStatements.conditional;

import java.util.Scanner;

public class BonusCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your salary");
        int salary = scanner.nextInt();
        System.out.println("Enter your year of service");
        int serviceDuration = scanner.nextInt();
        float bonusAmount = 0.0f;
        if(serviceDuration > 5){
            bonusAmount = salary * 0.5f;
        }
        System.out.println("Your bonus amount is "+bonusAmount);
    }
}
