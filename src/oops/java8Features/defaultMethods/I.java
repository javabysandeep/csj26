package oops.java8Features.defaultMethods;

import java.util.Collection;

public interface I {
    void m1();
    default void m2(){
        System.out.println("default implementation");
    }

}
