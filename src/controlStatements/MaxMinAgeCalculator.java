package controlStatements;

import java.util.Scanner;

public class MaxMinAgeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the ages for three persons");
        int person1Age = scanner.nextInt();
        int person2Age = scanner.nextInt();
        int person3Age = scanner.nextInt();
        int oldest = 0;
        int youngest = 0;
        //oldest
        if (person1Age > person2Age && person1Age > person3Age) {
            oldest = person1Age;
        } else if (person2Age > person1Age && person2Age > person3Age) {
            oldest = person2Age;
        } else {
            oldest = person3Age;
        }

        //youngest
        if (person1Age < person2Age && person1Age < person3Age) {
            youngest = person1Age;
        } else if (person2Age < person1Age && person2Age < person3Age) {
            youngest = person2Age;
        } else {
            youngest = person3Age;
        }
        System.out.println("Oldest " + oldest);
        System.out.println("Youngest " + youngest);
    }
}
