package oops.inheritance.question2;

public class Demo {
    public static void main(String[] args) {
       /* A a = new A();
        System.out.println(a.a);//1
        System.out.println(a.b);//2
        System.out.println(a.c);//3
        System.out.println(a.d);//4*/

       /* B b = new B();
        System.out.println(b.a);
        System.out.println(b.b);
        System.out.println(b.c);
        System.out.println(b.d);*/

        C c = new C();
        System.out.println(c.a);
        System.out.println(c.b);
        System.out.println(c.c);
        System.out.println(c.d);
        c.m1();
    }
}
