package classComponents;

public class Demo1 {
    public static void main(String[] args) {
        //primitive local variable
        int number = 50 * 12;
        System.out.println(number);
        for (int i = 1; i <=10 ; i++) {
            m1();
        }
    }

    private static void m1() {
        int i = 0;
        System.out.println("m1 "+i);
    }
}
