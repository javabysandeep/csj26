package accessSpecifiers;

import accessSpecifiers.p1.A;
import accessSpecifiers.p2.B;

public class Demo {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        //System.out.println(A.a);
        System.out.println(A.b);
        //System.out.println(A.c);
        //System.out.println(A.d);
    }
}
