package oops.inheritance.question1;

public class B extends A {
    public B() {
        // Every constructor has default call to the parent class constructor
        super();
        System.out.println("B");
    }

}
