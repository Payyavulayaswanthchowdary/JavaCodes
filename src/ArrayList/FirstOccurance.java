package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class FirstOccurance {
    public static void main(String[] args) {
        List l = new ArrayList();
        l.add(23);
        l.add("A");
        l.add(null);
        l.add(false);
        l.add(23);
        int ele = 23;
        int FirstOccurance = l.indexOf(ele);
        System.out.println(FirstOccurance);

    }
}
