package revision;

import controlStatements.conditional.Months;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        // values allowed : byte, short, int, char, string, enum
        // not allowed values : long, float, double, boolean

        // switch is used to compare single value across multiple values which are case label
        // value and case label data type must be same.
        // we can write any number of cases but case labels must be unique

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int value = scanner.nextInt();
        /*
         * 1. value must be of type : byte, short, int, char, String, enum
         * 2. switch passed value and case labels data type must be same
         * 3. case labels must be unique
         * 4. default is optional but we should write it.
         * 5. break is also optional but we should write it.
         *
         * break can be used in switch and loops
         * continue can be used only in loops to skip the iteration
         *
         * we cannot use continue in place of break in switch.
         * */
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 1) {
                continue;// skips the current iteration and continue from next iteration
            }
            System.out.println(i);
        }
        switch (value) {
            default:
                System.out.println("Invalid input");
                break;
            case 1:
                System.out.println("one");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
        }

        System.out.println(Months.JAN);
    }
}
