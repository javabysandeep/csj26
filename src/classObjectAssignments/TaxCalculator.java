package classObjectAssignments;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter gross salary and savings");
        int grossSalary = scanner.nextInt();
        int saving = scanner.nextInt();
        int tax = calculateTax(grossSalary,saving);
    }

    private static int calculateTax(int grossSalary, int saving) {
        int ABC = 10;
        int abc=10;

        int netTaxableAmount = grossSalary - saving;
        int tax = 0;

        if(netTaxableAmount < 250000){
            tax = 0;
        }

        return tax;
    }
}
