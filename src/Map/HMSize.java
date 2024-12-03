package Map;

import java.util.HashMap;
import java.util.Map;

public class HMSize {
    public static void main(String[] args) {
        Map<String,Integer> hm = new HashMap<>();
        hm.put("yaswa",4);
        hm.put("sasi",100);
        hm.put("ak",89);
        hm.put("brainey",90);
        hm.put(null,null);
        hm.put(null,65);
        hm.put("j",null);
        System.out.println(hm);//it takes  only one null key value it takes multiple null 's as values
        System.out.println(hm.size());
        System.out.println(hm.get("sasi"));
        System.out.println(hm.get("yaswa"));
        System.out.println(hm.remove("yaswa"));
        System.out.println(hm);
        System.out.println(hm.containsKey("ak"));
        System.out.println(hm.containsValue(65));
        //hm.clear();

    }
}
