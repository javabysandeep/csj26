package oops.abstraction.anonymosClass;

public abstract class A {
    abstract void m1();
    abstract void m2();

    public static void main(String[] args) {
        A a =  new A(){

            @Override
            void m1() {
                System.out.println("m1");

            }

            @Override
            void m2() {
                System.out.println("m2");
            }
        };
        a.m1();
        a.m2();
    }
}
