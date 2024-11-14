package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class IsEmpty {
    public static void main(String[] args) {
        List<String> l = new ArrayList<String>();
        //l.add("a");
        //l.add("b");
        //l.add("c");
        boolean flag = l.isEmpty();
        if(flag){
            System.out.println("the list is empty");
        }
        else{
            System.out.println("the list is not  empty");
        }
    }
}
