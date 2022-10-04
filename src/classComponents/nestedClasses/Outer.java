package classComponents.nestedClasses;

public class Outer {
    int a = 100;
    static int b = 200;

    //nested class : static nested class
    static class StaticNestedClass {
        int c = 300;
        static int d = 400;
    }

    //nested class : Non-static or inner clas
    //object specific : we cant have static members inside the inner class
    class Inner {
        int e = 500;
       /* static int f = 600;
        static void m1(){}
        static {}
        static class A{}*/
    }

    void m1() {
        //local inner class : cant have static members
        class LocalInner {
            int localvar = 1000;
           /* static int f = 600;
            static void m1(){}
            static {}
            static class A{}*/
        }
        int a = 50;
    }

    public static void main(String[] args) {

    }
}
