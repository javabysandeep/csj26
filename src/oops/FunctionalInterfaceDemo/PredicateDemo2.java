package oops.FunctionalInterfaceDemo;

import java.util.function.Predicate;

public class PredicateDemo2 {
    public static void main(String[] args) {

        //1. traditional way
        Predicate predicate = new PredicateImpl();

        //2. anonymous class
        Predicate predicate1 = new Predicate() {
            @Override
            public boolean test(Object o) {
                return false;
            }
        };

        //3. Lambda

        Predicate lambda = (object) -> false;

    }
}

class PredicateImpl implements  Predicate{
    @Override
    public boolean test(Object o) {
        return false;
    }
}