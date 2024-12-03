package Map;

import java.util.*;
import java.util.TreeMap;

public class TreeMapKeySet {
    public static void main(String[] args) {
        Map<String,Integer> m = new TreeMap();
        m.put("yaswa",8);
        m.put("jaswa",38);
        m.put("siva",236);
        m.put("lokesh",39874);
        for(Map.Entry<String,Integer>ma:m.entrySet()){
            System.out.println(m.keySet()+" "+m.values());
        }
    }
}
