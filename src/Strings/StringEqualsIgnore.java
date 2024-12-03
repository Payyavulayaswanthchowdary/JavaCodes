package Strings;

import java.util.Scanner;

public class StringEqualsIgnore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1 = sc.nextLine();
        if(s.equalsIgnoreCase(s1)){
            System.out.println("Both are equal");
        }
        else{
            System.out.println("Both are not equal");
        }
        sc.close();
    }
}
