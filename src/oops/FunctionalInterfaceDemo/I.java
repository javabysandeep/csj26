package oops.FunctionalInterfaceDemo;

@FunctionalInterface
public interface I {
    void m1();
//    void m2();
}

class A implements I{
    @Override
    public void m1() {
        System.out.println("traditional way");
    }
}
