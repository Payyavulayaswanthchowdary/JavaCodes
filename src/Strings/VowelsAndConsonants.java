package Strings;

public class VowelsAndConsonants {
    public static void main(String[] args) {
        String s ="yaswanth chowdary";
        int count =0;
        char c = 'u';
//        char [] c =s.toCharArray();
        if(c == 'a' ||c == 'e' || c=='i'|| c=='o'|| c=='u'){
            System.out.println("c is vowel");
        }
        else{
            System.out.println("c is consonant");
        }
    }
}
