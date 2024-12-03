package Strings;

import java.util.Scanner;

public class SplitFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String s = sc.nextLine();
        String[] s1 = s.split(" ");
        for(int i = 0;i<s.length();i++){
            System.out.println(s1[i]);
        }

    }

}
