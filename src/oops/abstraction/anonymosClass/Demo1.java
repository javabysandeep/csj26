package oops.abstraction.anonymosClass;

public class Demo1 {
    public static void main(String[] args) {
        // parent class ref = child class object
        A a = new B();
      //  a.m1();

        //for the anonymous class
        // we combine class definition and object creation
        // we are creating an object of an anonymous class that extends abstract class
        A a1 = new A(){
            // this is the body of anonymous class
            @Override
            void m1() {
                System.out.println("anon method overriden");
            }

            @Override
            void m2() {
                System.out.println("anon method overriden m2");
            }
        };
        a1.m1();
        a1.m2();
    }
}
