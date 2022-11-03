package oops.abstractionRevision;

public class Demo3 {
    public static void main(String[] args) {
        A a = new  A() {
            @Override
            void m1() {
                System.out.println("m1 method");
            }
        };
        a.m1();
//        A ab = new B();

    }
}




