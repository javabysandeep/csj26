package oops.polymorphism;

public class MethodOverloadingParentChild {
    public static void main(String[] args) {
        A ab = new B();
        System.out.println(ab.add(10,30));
    }
}
