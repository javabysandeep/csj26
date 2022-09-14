package revision;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int value = scanner.nextInt();
        if (value == 1) {
            System.out.println("One");
        } else if (value == 2) {
            System.out.println("Two");
        } else if (value == 3) {
            System.out.println("Three");
        } else {
            System.out.println("invalid input");
        }

    }
}
