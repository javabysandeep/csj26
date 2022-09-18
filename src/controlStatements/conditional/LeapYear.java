package controlStatements.conditional;

public class LeapYear {
    public static void main(String[] args) {
        int year = 2100;
//2020, 2000, 2100
        // number is divisible by 4 and
        // if it is century then it should be divisible by 400
        if (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0)) {
            System.out.println("its a leap year");
        } else {
            System.out.println("not a leap year");
        }

    }
}
