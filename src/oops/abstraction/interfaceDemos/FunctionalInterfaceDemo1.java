package oops.abstraction.interfaceDemos;

import java.util.function.Function;

public class FunctionalInterfaceDemo1 {
    public static void main(String[] args) {
        //way 1: create separate subclass
        Function function = new FunctionImpl();

        //way 2 : using anonymous class
        Function function1 = new Function(){
            @Override
            public Object apply(Object o) {
                return null;
            }
        };

        //way 3: using Lambda
        Function lambda = (object)-> null;

    }
}
class FunctionImpl implements  Function{
    @Override
    public Object apply(Object o) {
        return null;
    }
}
