package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HmKeySet {
    public static void main(String[] args) {
        Map  hm=new HashMap();
        hm.put("yaswa",485);
        hm.put("jaswa",384759);
        hm.put("lo",1000);
        hm.put("sai",893759);
         Set<String> st =hm.keySet();
        Iterator<String> it = st.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


    }
}
