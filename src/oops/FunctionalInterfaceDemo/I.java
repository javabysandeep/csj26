package oops.FunctionalInterfaceDemo;

public interface I {
    void m1();
}

class A implements I{
    @Override
    public void m1() {
        System.out.println("traditional way");
    }
}
