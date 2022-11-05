package oops.java8Features.defaultMethods;

public class D implements I{
    @Override
    public void m1() {
        System.out.println("m1 in D");
    }

    @Override
    public void m2() {
        System.out.println("default m2 overriden in D");
    }
}
