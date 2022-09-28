package classObjectAssignments;

public class Triangle1 {
    int side1;
    int side2;
    int side3;

    int area() {
        return side1 * side2 * side3 ;
    }

    int perimeter() {
        return side1 + side2 + side3;
    }

    void setValues(int a, int b, int c) {
        side1 = a;
        side2 = b;
        side3 = c;
    }

    public static void main(String[] args) {
        Triangle1 triangle1 = new Triangle1();
        triangle1.setValues(1,2,3);
        System.out.println("Area of triangle "+triangle1.area());
        System.out.println("Perimeter of triangle "+triangle1.perimeter());

        Triangle1 triangle2 = new Triangle1();
        triangle2.setValues(3,4,5);

        System.out.println("Area of triangle "+triangle2.area());
        System.out.println("Perimeter of triangle "+triangle2.perimeter());
    }


}
