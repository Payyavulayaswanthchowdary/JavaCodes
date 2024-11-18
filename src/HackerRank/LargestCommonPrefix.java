package HackerRank;
import java.io.*;
import java.util.*;

public class LargestCommonPrefix {

        public static void main(String[] args) {
            Scanner scr = new Scanner(System.in);
            int n = scr.nextInt();
            String [] array = new String[n];
            for(int i = 0;i<n;i++)
                array[i] = scr.next();

            Arrays.sort(array);
            String a = array[0],b = array[n-1];
            for(int i = 0;i<a.length() && i<b.length();i++)
                if(a.charAt(i) == b.charAt(i))
                    System.out.print(b.charAt(i));
                else
                    break;

        }
    }
