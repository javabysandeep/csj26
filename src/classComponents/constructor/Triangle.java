package classComponents.constructor;

public class Triangle {
    int side1;
    int side2;
    int side3;

    public Triangle(int s1, int s2, int s3){
        side1 = s1;
        side2 = s2;
        side3 = s3;
    }
    int area(){
        return side1 * side2 * side3;
    }

    int perimeter(){
        return side1 + side2 + side3;
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle(1,2,3);
        System.out.println("Area of Triangle "+triangle.area());
        System.out.println("Perimeter of Triangle "+triangle.perimeter());
    }
}
