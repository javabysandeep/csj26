package classObjectAssignments;

public class Area {
    int rectangleLength;
    int rectangleBreadth;

    void setDimension(int length, int breadth){
        //assign local variable values to the instance variable
        rectangleLength = length;
        rectangleBreadth = breadth;
    }

    int getArea(){
        return rectangleLength * rectangleBreadth;
    }

    public static void main(String[] args) {
        Area area = new Area();
        area.setDimension(10,5);
        System.out.println("Area of rectangle =" + area.getArea()) ;

    }
}
