package collectionFramework.mapImplementations;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class FindOccurenceOfEachCharacter {
    public static void main(String[] args) {
        String str = "welcome to collection framework";
        str = str.trim().replace(" ", "");
        Map<Character, Integer> charMap = new HashMap<>();
        for (char ch : str.toCharArray()) {
            if (!charMap.containsKey(ch)) {
                charMap.put(ch, 1);
            } else {
                charMap.put(ch, charMap.get(ch) + 1);
            }
        }
        System.out.println(charMap);
    }
}
