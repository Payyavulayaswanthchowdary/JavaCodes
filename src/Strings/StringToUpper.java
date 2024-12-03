package Strings;

import java.util.Scanner;

public class StringToUpper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s.toUpperCase());
        sc.close();
    }
}
