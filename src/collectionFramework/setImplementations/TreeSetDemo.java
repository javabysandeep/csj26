package collectionFramework.setImplementations;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        Set set =  new TreeSet();
        set.add(100);
        set.add(200);
        set.add(300);
        set.add(400);
        set.add(400);

        System.out.println(set);
    }
}
