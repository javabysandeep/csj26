package collectionFramework.setImplementations;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo2 {
    public static void main(String[] args) {
        Set<Product> set =  new HashSet<>();
        set.add(new Product(11, 100,19,"chargers"));
        set.add(new Product(1, 90,29,"mobile"));
        set.add(new Product(12, 110,9,"bottles"));
        set.add(new Product(2, 80,39,"laptops"));
        set.add(new Product(3, 120,1,"cables"));
        set.forEach(System.out::println);
    }
}
