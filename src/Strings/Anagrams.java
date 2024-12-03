package Strings;

import java.lang.reflect.Array;
import java.util.Arrays;


public class Anagrams {
    public static void main(String[] args) {
        String s = "Care";
        String s1 ="Race";
        String s2 =s.toLowerCase();
        String s3 =s1.toLowerCase();
        if(s2.length() == s3.length()){
            char[] ch=s2.toCharArray();
            char[] ch1=s3.toCharArray();
            Arrays.sort(ch);
            Arrays.sort(ch1);
            if(Arrays.equals(ch,ch1)){
                System.out.println("both strings are anagrams");
            }
            else{
                System.out.println("both strings are not anagrams");
            }
        }

    }
}
