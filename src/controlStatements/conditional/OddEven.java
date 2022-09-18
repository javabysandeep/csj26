package controlStatements.conditional;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        System.out.println("Enter the number ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if(number%2==0){
            System.out.println("even number");
        } else{
            System.out.println("odd number");
        }

    }
}
