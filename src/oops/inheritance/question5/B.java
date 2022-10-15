package oops.inheritance.question5;

public class B extends A {
    void m1() {
        System.out.println("B m1");
    }
    void m2(){
        m1();
        //calling parent class method
        m3();
        this.m3();
        super.m3();
    }

}
