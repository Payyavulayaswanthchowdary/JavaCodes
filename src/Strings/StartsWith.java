package Strings;

import java.util.Scanner;

public class StartsWith {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String s = sc.nextLine();
        System.out.println(s.startsWith("ya"));
        System.out.println(s.endsWith("baa"));
    }
}
