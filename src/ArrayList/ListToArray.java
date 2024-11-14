package ArrayList;


import java.util.ArrayList;
import java.util.List;

public class ListToArray{

public static void main(String[] args)
{
    List<String> l=new ArrayList<String>();
    l.add("B");
    l.add("C");
    l.add("A");
    Object[] ob = l.toArray();
    for(Object temp:ob)
    {
        System.out.println(temp);
    }
}

}
