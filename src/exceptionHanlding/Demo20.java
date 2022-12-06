package exceptionHanlding;

public class Demo20 {
    public static void main(String[] args) {
        System.out.println(getValue());
    }

    //Can we keep the statements after finally block
    // If the control is returning from the finally block itself?
    //ans. no
    private static int getValue() {
        try {
            return 1;
        } catch (Exception exception) {
            return 2;
        } finally {
            //return 3;
            //Does finally block get executed If either try or catch blocks are returning the control?
            //
            //Yes, finally block will be always executed no matter whether try or catch blocks are returning the control or not.
            System.out.println("finally block");
        }
//        System.out.println("after finally when return is there");//CTE

    }
}
