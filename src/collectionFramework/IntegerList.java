package collectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IntegerList {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(10);
        integerList.add(20);
        integerList.add(11);
        integerList.add(9);
        integerList.add(6);
        integerList.forEach(System.out::println);
        System.out.println("**********sorted list*********");

        Collections.sort(integerList);
        integerList.forEach(System.out::println);

    }
}
