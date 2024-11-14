package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NonSynchronizeListToSL {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("a");
        al.add("c");
        al.add("b");
        al.add("a");
        List<String> Synchronized = Collections.synchronizedList(al);
        System.out.println(Synchronized);
    }
}
