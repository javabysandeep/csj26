package oops.finalKeyword;

public class Demo1 {
    final int instancePrimitiveVariable;

    Demo1(int localPrimitiveVariable) {
        this.instancePrimitiveVariable = localPrimitiveVariable;
    }
    /*{
        instancePrimitiveVariable=100;
    }*/

    static final int staticVariable;
    static {
        staticVariable=100;
    }

    public static void main(String[] args) {
        final int localPrimitiveVariable = 100;
        //CTE
        // localPrimitiveVariable = 200;
        System.out.println(localPrimitiveVariable);
    }
}
