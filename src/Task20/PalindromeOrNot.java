package Task20;

import java.util.Scanner;

public class PalindromeOrNot {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int rem = 0;
        int rev = 0;
        int temp=n;
        while(n>0){
            rem = n % 10;
            rev = rev * 10 + rem;
            n = n/10;
        }
        if(temp == rev){
            System.out.println("the number is palindome");
        }
        else{
            System.out.println("not a palindrome");
        }
    }
}
