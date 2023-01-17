package collectionFramework.mapImplementations;

import java.util.HashMap;
import java.util.Map;

public class HashDemo1 {
    public static void main(String[] args) {
        //if the key is already there then value be updated
        // when new entry is added with the same key
        Map map = new HashMap();
        map.put(1, "abc");
        map.put(3, "abc");
        map.put(null, null);
        map.put(null, null);
        map.put("abc", null);
        map.put(1, "xyz");
        map.put(1, "pqr");
        map.put(1, "value will be updated");
        System.out.println(map);

    }
}
