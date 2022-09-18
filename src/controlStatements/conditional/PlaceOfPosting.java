package controlStatements.conditional;

import java.util.Scanner;

public class PlaceOfPosting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age, Gender, marital status ");
        int age = scanner.nextInt();
        char gender = scanner.next().charAt(0);
        char maritalStatus = scanner.next().charAt(0);

        if (gender == 'F') {
            System.out.println("Gender " + gender + "\t will work in urban area");
        } else if (gender == 'M' && (age > 20 && age < 40)) {
            System.out.println("Gender " + gender + "\t will work anywhere");
        } else if (gender == 'M' && (age > 40 && age < 60)) {
            System.out.println("Gender " + gender + "\t will work in urban area");
        }  else{
            System.out.println("ERROR");
        }

    }
}
