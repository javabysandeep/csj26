package collectionFramework.listImplementations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListProductDemo {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        Product product1 = new Product(1,"laptop",65000);
        Product product2 = new Product(11,"mobile",4500);
        Product product3 = new Product(6,"tablet",72000);
        Product product4 = new Product(5,"wireless charger",1000);

        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);

        productList.forEach(System.out::println);
        System.out.println("Sort the products based on product price");
        //Collections.sort(productList, (p1, p2) -> p1.getProductPrice()-p2.getProductPrice());
        Collections.sort(productList, Comparator.comparingInt(Product::getProductPrice));
        productList.forEach(System.out::println);
        System.out.println("********** Sort the products based on product name ********");
        Collections.sort(productList,
                (p1,p2)->p1.getProductName().compareTo(p2.getProductName()));
        productList.forEach(System.out::println);
        // multi-field sorting: Comparator



    }
}
