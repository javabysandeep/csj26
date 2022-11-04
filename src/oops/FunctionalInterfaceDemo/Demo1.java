package oops.FunctionalInterfaceDemo;

public class Demo1 {
    public static void main(String[] args) {
        //1. traditional way
        I i = new A();
        i.m1();

        //2. Anonymous class way
        I i1 = new I() {
            @Override
            public void m1() {
                System.out.println("anonymous class way");
            }
        };
        i1.m1();
    }
}
