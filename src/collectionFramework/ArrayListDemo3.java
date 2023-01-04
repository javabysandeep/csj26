package collectionFramework;

import java.util.*;

public class ArrayListDemo3 {
    public static void main(String[] args) {
        List arrayList = new ArrayList();//container

        // can add duplicates
        // can add nulls any no. of time
        // heterogeneous data
        //insertion order is maintained
        arrayList.add(10);
        arrayList.add(10);
        arrayList.add("string");
        arrayList.add("string");
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(10.5f);
        arrayList.add(10.5d);
        arrayList.add(true);

        //remove single element
        boolean isRemoved = arrayList.remove("string123");
        System.out.println(isRemoved);

        System.out.println("No.of elements in the collection "+arrayList.size());
        System.out.println(arrayList);
        System.out.println(arrayList.contains("string"));
    }

}
