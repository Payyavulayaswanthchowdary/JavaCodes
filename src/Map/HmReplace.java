package Map;

import java.util.*;

public class HmReplace {
    public static void main(String[] args) {
        Map m =new HashMap();
        m.put("yaswa",8);
        m.put("vijaya",387);
        m.put("samba",239);
        m.put("jaswa",89327);
        m.replace("yaswa",9);
        m.replace("samba",239,43890);
        for(Object ma:m.entrySet()){
            System.out.println(m.keySet()+" "+m.values());
        }

    }
}
