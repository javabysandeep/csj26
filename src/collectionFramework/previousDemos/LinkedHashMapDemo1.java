package collectionFramework.previousDemos;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo1 {
    public static void main(String[] args) {
        Map map = new LinkedHashMap();
        System.out.println("size of a map " + map.size());

        // keys should be unique, homo, heterogeneous, null@1, no SO
        //for linkedHashMap, insertion order will be maintained
        //there is no restriction for values
        map.put('A', 50);
        map.put("Aabc", 50);
        map.put(60, 50);
        map.put(true, 50);
        map.put(null, 50);
        map.put(null, 50);
        map.put(false, 50);
        System.out.println(map);
    }
}
