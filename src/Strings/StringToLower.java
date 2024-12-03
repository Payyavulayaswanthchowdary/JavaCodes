package Strings;

import java.util.Scanner;

public class StringToLower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String s = sc.nextLine();
        System.out.println(s.toLowerCase());
        sc.close();
    }
}
