package Map;

import java.util.*;

public class LhMapEntrySet {
    public static void main(String[] args) {
        Map<String,Integer> m= new LinkedHashMap<>();
        m.put("pavan",933);
        m.put("mohamad",9283);
        m.put("yaswa",60);
        m.put("jaswa",89);
        for(Map.Entry<String,Integer>ma:m.entrySet()){
            System.out.println(m.keySet()+" "+m.values());
        }
    }
}
