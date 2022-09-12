package operators;

public class LogicalOperators {
    public static void main(String[] args) {
        // &, &&, |, ||, ^, !

        // for &, if the input is number type it will perform bitwise and operation.
        // If the input is boolean type it will perform logical and operation
        // both logical and bitwise operator
        System.out.println(4 & 5);//4 bitwise and operation
        // 4  --> 1 0 0
        //5   --> 1 0 1
        //&------>1 0 0 ---> 4
        System.out.println(true & true);//true. logical and operation

//        System.out.println(4 && 5);//CTE
        System.out.println(true && false);//false

        System.out.println(4 | 5);//5
        // 4  --> 1 0 0
        //5   --> 1 0 1
        //|------>1 0 1 ---> 5
//        System.out.println(4 || 5);//CTE
        System.out.println(true | false);//true
        System.out.println(true || false);//true

        //XOR
        System.out.println(4 ^ 5);//bitwise XOR --> 1
        // 4  --> 1 0 0
        //5   --> 1 0 1
        //^------>0 0 1 ---> 1
        System.out.println(true ^ true);//bitwise XOR --> false
        System.out.println(true ^ false);//bitwise XOR --> true

//        System.out.println(!4);
        System.out.println(!true);//false
        System.out.println(!false);//true

        System.out.println( (4 > 5) && (3 < 4));//false
        System.out.println( (4 > 5) || (3 < 4));//true
        System.out.println( (4 > 5) ^ (3 < 4));//true

    }
}
