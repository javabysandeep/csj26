package oops.polymorphism;

public class B extends A{
    //method overriding
    int add(int a, int b){
        System.out.println("B class");
        return a+b;
    }
    //method overloading
    float add(float a, float b){
        System.out.println("B class");
        return a+b;
    }
}
