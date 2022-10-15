package oops.inheritance.question4;

public class Demo {
    public static void main(String[] args) {

        B b = new B();
        b.setParentInstanceVariables(11,22,33,44);
        b.setInstanceVariables(111,222,333,444);

        //child class B : instance variables
        System.out.println(b.a);
        System.out.println(b.b);
        System.out.println(b.c);
        System.out.println(b.d);

        //Accessing the parent class variables through method of class B
        System.out.println("Parent class ");
        b.printParentInstanceVariables();




    }
}
