package oops.java8Features.defaultMethods;

public class InheritanceDemo {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.m1();//parent m1

        Child child = new Child();
        child.m1();//child m1

        Parent pc = new Child();
        pc.m1();//child m1
    }
}
