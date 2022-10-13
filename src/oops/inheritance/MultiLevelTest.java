package oops.inheritance;

public class MultiLevelTest {
    public static void main(String[] args) {
        //Case1 : Parent class reference = parent class object
        //Parent class cannot access the child class members
        //Parent class can access only its values
        A a = new A();
        System.out.println(a.a);


        //Case 2: Child class reference = child class object
        // with this child class reference we can every thing from child class as well from parent class
        B b = new B();
        System.out.println(b.a);
        System.out.println(b.b);
        b.m1();
        b.m2();
        b.m3();

        //case 3: Parent class reference = child class object
        A ab  = new B();

    }
}
