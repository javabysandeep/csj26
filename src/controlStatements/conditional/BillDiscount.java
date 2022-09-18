package controlStatements.conditional;

import java.util.Scanner;

public class BillDiscount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the product quantity");
        int quantity = scanner.nextInt();

        System.out.println("Enter the product price");
        int productPrice = scanner.nextInt();

        int billAmount = productPrice  * quantity;

        float finalBillAmount = 0;
        if(billAmount > 1000){
            finalBillAmount = (float) (billAmount - billAmount * 0.1);
        } else {
            finalBillAmount = billAmount;
        }
        System.out.println("Bill amount "+finalBillAmount);


    }
}
