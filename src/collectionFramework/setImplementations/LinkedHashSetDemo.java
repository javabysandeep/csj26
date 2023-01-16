package collectionFramework.setImplementations;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        Set set =  new LinkedHashSet();
        set.add(100);
        set.add(200);
        set.add(300);
        set.add(400);
        set.add(400);
        set.add("abc");
        set.add(null);
        set.add(null);
        System.out.println(set);
    }
}
