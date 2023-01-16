package collectionFramework.mapImplementations;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo1 {
    public static void main(String[] args) {
        Map map = new TreeMap();
        System.out.println("size of a map " + map.size());

        // keys should be unique, homo, no null insertion
        //for TreeMap, sorting order of keys  will be maintained
        //there is no restriction for values
        map.put("A", 50);
        map.put("xyz", 50);
        map.put("mnp", 50);
        map.put("false", 50);
        System.out.println(map);
    }
}
