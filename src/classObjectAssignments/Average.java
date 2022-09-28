package classObjectAssignments;

import java.util.Scanner;

public class Average {
    void calculate(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        float average = (float)(number1+number2+number3)/3;
        System.out.printf("Average of three numbers = %2f"+average);
    }

    public static void main(String[] args) {
        Average average = new Average();
        average.calculate();
    }
}
