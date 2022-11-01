package oops.abstraction.interfaceDemos;

public interface MessageService {
   //instance variable are not allowed
    // instance methods are not allowed
    // instance block are not allowed
    //static block are not allowed
    //constructor are not allowed
    // Inner class are not allowed

    // abstract methods are allowed
    //static methods  allowed from java 8. It is not allowed till Java 7
    //default methods are allowed from java 8.
    //static variable allowed
    //static nested class allowed
}
interface  I1 {
//    int var=10;
    //void m1(){}
//    I1(){}
//{}
//    static {}
  public  static  class A {}
}
interface  I2 {
    //    int var=10;
    //void m1(){}
    // I2(){}
    //{}
    //    static {}
   static class A {}
}

class C implements I1, I2 {
    public C(){
        super();
    }
    public static void main(String[] args) {
        C c = new C();
//        c.m1();
        //c.var;
    }
}
