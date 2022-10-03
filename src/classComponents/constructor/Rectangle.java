package classComponents.constructor;

public class Rectangle {
    int length;
    int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    int areaOfRectangle() {
        return this.length * this.breadth;
    }

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(4, 5);
        Rectangle rectangle2 = new Rectangle(5, 8);
        System.out.println("Area of reactgel1 " + rectangle1.areaOfRectangle());
        System.out.println("Area of reactgle2 " + rectangle2.areaOfRectangle());
    }
}
