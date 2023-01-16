package collectionFramework.setImplementations;

import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<Integer> set =  new HashSet<>();
        set.add(100);
        set.add(200);
        set.add(300);
        set.add(400);
        set.add(400);
        set.add(null);
        set.add(null);
        System.out.println(set);
    }
}
