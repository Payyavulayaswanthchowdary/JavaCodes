package Task20;

public class ReverseAString {
    public static void main(String[] args) {
        String s = "madam";
        String rev = "";
        for(int i =s.length()-1;i>=0;i--){
            rev = rev+s.charAt(i);
            //System.out.print(s.charAt(i));

        }
        if(s.equals(rev)){

            System.out.println("palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }


    }
}
