package collectionFramework;

import java.util.Collection;
import java.util.Iterator;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        //colleciton framework : java.util package
        Iterable iterable = ()-> new Iterator() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Object next() {
                return null;
            }
        };
    }
}
