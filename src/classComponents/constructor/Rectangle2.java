package classComponents.constructor;

import java.util.Scanner;

public class Rectangle2 {
    int length;
    int breadth;

    public Rectangle2(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    int areaOfRectangle() {
        return this.length * this.breadth;
    }

    public static void main(String[] args) {
        System.out.println("Enter the length and breadth");
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int breadth = scanner.nextInt();
        Rectangle2 rectangle1 = new Rectangle2(length   , breadth);
        System.out.println("Area of reactgel1 " + rectangle1.areaOfRectangle());

    }
}
