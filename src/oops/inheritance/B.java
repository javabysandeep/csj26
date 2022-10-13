package oops.inheritance;

public class B extends A {
    int a = 199;
    int b = 200;

    public B() {
        System.out.println("B");
    }
    void m2(){
        System.out.println("m2 in B");
    }
    void m3(){
        System.out.println("m3 in B");
    }
}
