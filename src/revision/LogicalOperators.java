package revision;

public class LogicalOperators {
    public static void main(String[] args) {
        //  AND, OR< XOR, NOT these are not keywords in java
        int number1 = 100;
        int number2 = 200;

        // logical operators : &, &&, |, ||, ^, !,
        System.out.println((5 > 6) && (10 % 0 == 0));
        System.out.println((5 > 3) || (10 % 0 == 0));
        //System.out.println((5 > 3) | (10 % 0 == 0));

//        System.out.println(4&&5);//CTE
        //System.out.println(4||5);//CTE: && , || are pure logical operators will work on boolean input

        System.out.println(true & true);
        System.out.println(true | true);
        System.out.println(4&5);// bitwise and operation
        System.out.println(4|5);// bitwise and operation
    }
}
