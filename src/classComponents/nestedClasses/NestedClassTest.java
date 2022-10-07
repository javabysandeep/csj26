package classComponents.nestedClasses;

import java.util.ArrayList;

public class NestedClassTest {
    public static void main(String[] args) {
        Outer outer = new Outer();
        System.out.println("Instance variable "+outer.a);
        System.out.println("Static variable "+Outer.b);

        Outer.StaticNestedClass  staticNestedClass = new Outer.StaticNestedClass();


        System.out.println("Instance variable "+staticNestedClass.c);
        System.out.println("Static variable "+Outer.StaticNestedClass.d);
    }
}
