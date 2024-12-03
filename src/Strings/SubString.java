package Strings;

import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String s = sc.nextLine();
        String substring = s.substring(2);
        System.out.println(substring);
        String s1 = s.substring(2,5);
        System.out.println(s1);
    }
}
