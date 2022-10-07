package classComponents.nestedClasses;

public class Demo {
    int a = 100;
    void m1(){
        System.out.println("instance method m1");
    }

    static int b = 200;
    static void m2(){
        System.out.println("static method m2");
    }
    static class A {
        static int number = 400;
    }
    Demo(){
        System.out.println("Constructor");
    }
    {
        System.out.println("Instance block");
    }

    static {
        System.out.println("static block");
    }
    public static void main(String[] args) {
        int b = 300;
        Demo demo = new Demo();
        System.out.println("Instance variable " + demo.a);
        System.out.println("Static variable " + Demo.b);
        System.out.println("Local variable " + b);
        demo.m1();
        Demo.m2();

        System.out.println(Demo.A.number);

    }
}
