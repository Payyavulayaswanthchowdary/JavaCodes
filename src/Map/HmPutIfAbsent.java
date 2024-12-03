package Map;

import java.util.HashMap;
import java.util.Map;

public class HmPutIfAbsent {
    public static void main(String[] args) {
        Map<String,Integer> m = new HashMap<String,Integer>();
        m.put("yaswa",29);
        m.put("vijaya",3497);
        m.put("samba",93940);
        m.put("jaswa",9230240);
        m.putIfAbsent("yaswa",98374);
        for(Map.Entry<String,Integer> me: m.entrySet()){
            System.out.println(me.getKey()+" "+me.getValue());
        }
    }
}
