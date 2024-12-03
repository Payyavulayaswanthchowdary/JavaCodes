package Strings;

import java.util.Scanner;

public class StringEquals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1 = sc.nextLine();
        if(s.equals(s1)){
            System.out.println("Both Strings are equal");
        }
        else{
            System.out.println("both strings are not equal");
        }
        sc.close();

    }
}
