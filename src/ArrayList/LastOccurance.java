package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class LastOccurance {
    public static void main(String[] args) {
        List l = new ArrayList();
        l.add(23);
        l.add("A");
        l.add(23);
        l.add("A");
        l.add(23);
        int ele = 23;
        int LastOccurance = l.lastIndexOf(ele);
        System.out.println(LastOccurance);
    }
}
