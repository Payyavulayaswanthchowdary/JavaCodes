package Strings;

public class CompareMethod {
    public static void main(String[] args) {
        String s = "Yaswa";
        String s1 = "jaswa";
        int a = s.compareTo(s1);
        if(a>0){
            System.out.println("s is greater than s1");
        }
        else if(a<0){
            System.out.println("s1 is greater than s");
        }
        else{
            System.out.println("s and s1 are equal");
        }
    }
}
