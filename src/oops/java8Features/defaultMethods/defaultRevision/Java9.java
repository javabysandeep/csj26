package oops.java8Features.defaultMethods.defaultRevision;

public class Java9 {
    public static void main(String[] args) {

    }
}

interface IntegerProcessor {
    //1. public abstract method
    void m1();

    //2. public default method
    default void m2() {
        //100000 statements
        /*m4();
        m5();
        m6();*/
        //m7();
    }

    /*private void m4() {
    }

    private void m5() {
    }

    private void m6() {
    }*/

   /* private void m7() {
    }*/

    //3. public static method
    static void m3() {
        //100000 statements
        /*m8();
        m9();
        m10();
        m11();*/
    }

   /* private static void m8() {
    }

    private static void m9() {
    }

    private static void m10() {
    }

    private static void m11() {
    }*/
}