package controlStatements.looping;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int gcd = 0;
        for (int i = 1; i <=number1/2 ; i++) {
            if (number1%i==0){
                if(isPrime(i)){
                    System.out.println("Prime factor "+i);
                }
            }
        }
    }

    private static boolean isPrime(int number) {
        boolean isPrime = true;
        for (int i = 2; i <number/2 ; i++) {
            if(number%i==0){
                isPrime=false;
                break;
            }
        }
        return  isPrime;
    }
}
