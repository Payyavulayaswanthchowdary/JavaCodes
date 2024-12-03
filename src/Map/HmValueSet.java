package Map;

import java.util.HashMap;
import java.util.*;

public class HmValueSet {
    public static void main(String[] args) {
        Map m = new HashMap();
        m.put("yaswa",834);
        m.put("jaswa",84);
        m.put("lo",349);
        m.put("sai",340);
        Collection <Integer>  s = m.values();
        Iterator<Integer> i = s.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

    }
}
