package collectionFramework.mapImplementations;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo1 {
    public static void main(String[] args) {
        Map map = new HashMap<>();
        System.out.println("size of a map " + map.size());

        // keys should be unique, homo, heterogeneous, null@1, no IO, no SO
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
