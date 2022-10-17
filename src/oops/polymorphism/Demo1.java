package oops.polymorphism;

public class Demo1 {

   final int add(int a, int b) {
        return a + b;
    }

    String add(String a, String b){
        return a+b;
    }

    int add(float num1, float num2) {
        return (int) (num1 + num2);
    }

    int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static void main(String[] args) {
        Demo1 d = new Demo1();
        System.out.println(d.add(10,20));
        System.out.println(d.add(10.5f,20.5f));
        System.out.println(d.add(10,20,30));
        System.out.println(d.add("10","20"));

    }
}
