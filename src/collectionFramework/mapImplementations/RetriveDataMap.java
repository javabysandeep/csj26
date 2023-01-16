package collectionFramework.mapImplementations;

import java.util.HashMap;
import java.util.Map;

public class RetriveDataMap {
    public static void main(String[] args) {
        Map<String, Integer> marks =  new HashMap<>();
        marks.put("abc",50);
        marks.put("xyz",60);
        marks.put("p",40);
        marks.put("q",70);
        marks.put("cd",30);

        System.out.println("only student names i.e. keys "+ marks.keySet());
        System.out.println("only student marks i.e. value "+ marks.values());
        System.out.println(" marks of xyz "+ marks.get("xyz"));
        System.out.println(" Entire student records "+ marks.entrySet());
    }
}
