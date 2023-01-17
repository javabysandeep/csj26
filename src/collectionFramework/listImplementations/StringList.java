package collectionFramework.listImplementations;

import java.util.*;

public class StringList {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("cyber");
        stringList.add("success");
        stringList.add("java");
        stringList.add("python");
        stringList.add("testing");
        stringList.add("cloud");
        //add, remove, search, traverse
        for (int index = 0; index < stringList.size() ; index++) {
            System.out.println(stringList.get(index));
        }
        System.out.println("******** foreach **********");
        for (String str: stringList) {
            System.out.println(str);
        }
        System.out.println("******** Java 8 way **********");
        stringList.forEach(System.out::println);//method reference

        System.out.println("******** After sorting **********");
        Collections.sort(stringList);
        stringList.forEach(System.out::println);




    }

}
