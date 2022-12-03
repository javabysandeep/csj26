package exceptionHanlding;

public class Demo4 {
    public static void main(String[] args) {
        Integer integer = Integer.valueOf("123");//NumberFormatException
        System.out.println(integer);

        String str = "abc";
        System.out.println(str.charAt(3));//java.lang.StringIndexOutOfBoundsException

    }
}
