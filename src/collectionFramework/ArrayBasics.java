package collectionFramework;

import classComponents.constructor.Product;

import java.util.ArrayList;
import java.util.Vector;

public class ArrayBasics {
    public static void main(String[] args) {
        int a = 20;
        boolean b = true;

        Object[] objects = new Object[10];
        objects[0] = a;
        objects[1] = b;
        Product product = new Product();
        objects[2] = product;
        for (Object obj:objects) {
            if (obj.equals(20)){
                System.out.println("found");
                break;
            }
        }

    }
}
