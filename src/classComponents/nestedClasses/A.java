package classComponents.nestedClasses;

public class A {
    int a = 100;
    void m1(){
        System.out.println("instance method of class A");
    }
    //static nested class
    static class B {
        static int a = 100;
        int b = 200;
    }

    //Inner class
    class C {
        int p = 1;
        void m1() {
            System.out.println("Inner class instance method");
        }
    }


    public static void main(String[] args) {
        //Accessing Inner class
        A a = new A();
        System.out.println(a.a);
        a.m1();

        A.C c = a.new C();
        System.out.println(c.p);
        c.m1();

        //Accessing static nested class
        System.out.println(A.B.a);
        A.B b = new A.B();
        System.out.println(b.b);


    }
}
