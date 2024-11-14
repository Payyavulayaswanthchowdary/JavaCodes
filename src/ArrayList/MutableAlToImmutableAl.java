package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MutableAlToImmutableAl {
    public static void main(String[] args) {
        ArrayList<String> l1=new ArrayList<String>();
        l1.add("A");
        l1.add("B");
        l1.add("C");
        List<String> unmodifiableList =  Collections.unmodifiableList(l1);
        //unmodifiableList.add("D");
        l1.add("D");
        System.out.println(unmodifiableList);


    }
}
