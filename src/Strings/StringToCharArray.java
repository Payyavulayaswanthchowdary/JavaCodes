package Strings;

import java.util.Scanner;

public class StringToCharArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String s = sc.nextLine();
        //char[] a = s.toCharArray();
       // System.out.println(a);
        System.out.println(s.toCharArray());
        sc.close();
    }
}
