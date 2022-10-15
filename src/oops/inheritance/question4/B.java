package oops.inheritance.question4;

public class B extends A {
    int a = 10;
    int b = 20;
    int c = 30;
    int d = 40;
    void m1(){
        System.out.println("B m1");
    }

    void setInstanceVariables(int a, int b, int c, int d){
        //assigning local variable value to the instance variable
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    void setParentInstanceVariables(int a, int b, int c, int d){
        //assigning local variable to parent class instance variables
        super.a = a;
        super.b = b;
        super.c = c;
        super.d = d;
    }

    void printParentInstanceVariables(){
        System.out.println(super.a);
        System.out.println(super.b);
        System.out.println(super.c);
        System.out.println(super.d);
    }

}
