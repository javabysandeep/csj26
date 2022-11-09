package oops.finalKeyword;

class Child extends  Parent{
    @Override
    void m1() {
        System.out.println("child m1");
    }
    final static void m2(){}
}