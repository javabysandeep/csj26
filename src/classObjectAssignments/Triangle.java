package classObjectAssignments;

public class Triangle {
    int side1;
    int side2;
    int side3;

    int area() {
        return side1 * side2 * side3 ;
    }

    int perimeter() {
        return side1 + side2 + side3;
    }

    public static void main(String[] args) {
        Triangle triangle1 = new Triangle();
        triangle1.side1 = 1;
        triangle1.side2 = 2;
        triangle1.side3 = 3;
        System.out.println("Area of triangle "+triangle1.area());
        System.out.println("Perimeter of triangle "+triangle1.perimeter());
    }
}
