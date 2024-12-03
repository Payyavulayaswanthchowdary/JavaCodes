package Strings;

import java.util.Scanner;

public class StringIndexOf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String s = sc.nextLine();
       // int indx=s.indexOf("w");
        for(int i = 0;i<s.length();i++){
            System.out.println(s.indexOf("a"));
            break;
        }
        sc.close();
    }
}
