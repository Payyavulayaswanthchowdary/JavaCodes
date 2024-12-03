package Strings;

public class ReverseString {
    public static void main(String[] args) {
        // one way is using loops
        String s = "pavan";
        String rev ="";
        for(int i = s.length()-1;i>=0;i--){
            rev+=s.charAt(i);
        }
        System.out.println(rev);

        // another way is that using StringBuilder and reverse() method
        StringBuilder sb = new StringBuilder("pavan");
         sb.reverse();
        System.out.println(sb);

    }
}
