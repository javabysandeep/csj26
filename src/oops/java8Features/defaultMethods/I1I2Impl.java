package oops.java8Features.defaultMethods;

public class I1I2Impl implements I1, I2{
    @Override
    public void m1() {
        I1.super.m1();
        I2.super.m1();
    }

    public static void main(String[] args) {
        I1 i1 = new I1I2Impl();
        i1.m1();

        I2 i2 = new I1I2Impl();
        i1.m1();
    }
}
