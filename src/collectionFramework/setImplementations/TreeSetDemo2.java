package collectionFramework.setImplementations;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo2 {
    public static void main(String[] args) {
        Set<Product> set =  new TreeSet<>((o1, o2) -> o1.getProductId()-o2.getProductId());
        set.add(new Product(11, 100,19,"chargers"));
        set.add(new Product(1, 90,29,"mobile"));
        set.add(new Product(12, 110,9,"bottles"));
        set.add(new Product(2, 80,39,"laptops"));
        set.add(new Product(3, 120,1,"cables"));
        set.forEach(System.out::println);
    }
}
