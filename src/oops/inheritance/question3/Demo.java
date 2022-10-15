package oops.inheritance.question3;

public class Demo {
    public static void main(String[] args) {
        A ab = new B();
        System.out.println(ab.a);
        System.out.println(ab.b);
        System.out.println(ab.c);
        System.out.println(ab.d);
        ab.m1();

        C c = new C();
        System.out.println(c.a);
        System.out.println(c.b);
        System.out.println(c.c);
        System.out.println(c.d);
        c.m1();
        System.out.println("C class object and B class ref");

        B bc = new C();
        System.out.println(bc.a);
        System.out.println(bc.b);
        System.out.println(bc.c);
        System.out.println(bc.d);
        bc.m1();

        A ac = new C();
        System.out.println(ac.a);
        System.out.println(ac.b);
        System.out.println(ac.c);
        System.out.println(ac.d);
        ac.m1();

    }
}
