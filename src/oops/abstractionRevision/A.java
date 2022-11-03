package oops.abstractionRevision;

abstract public class A {
    abstract void m1();
    A(){
        System.out.println("A con");
    }
    {
        System.out.println("instance block from abstract class");
    }
    abstract class Nested{

    }
}
