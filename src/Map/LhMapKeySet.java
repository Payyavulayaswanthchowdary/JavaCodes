package Map;

import java.util.LinkedHashMap;
import java.util.*;

public class LhMapKeySet {
    public static void main(String[] args) {
        Map<String,Integer> m= new LinkedHashMap<>();
        m.put("pavan",933);
        m.put("mohamad",9283);
        m.put("yaswa",60);
        m.put("jaswa",89);
        Set<String> s=m.keySet();
        Iterator<String> i=s.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }


    }
}
