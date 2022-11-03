package oops.abstractionRevision;

public class InterfaceDemo {
    public static void main(String[] args) {
        Child child = new Child();
        System.out.println(I1.variable);
        System.out.println(I2.variable);

    }
}

interface I1{
    public static final int variable=100;
    /*int a;
    void m1(){}
    {}
    static {}
    I1(){}
    class IC{}
*/
    //void m1();
    }
interface I2{
    public static final int variable=200;
    /*int a;
    void m1(){}
    {}
    static {}
    I1(){}
    class IC{}*/
}
class Child implements I1, I2{

}
