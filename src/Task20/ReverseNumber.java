package Task20;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int rem = 0;
        int rev = 0;
        int temp ;
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        while(n>0){
            rem = n%10;
            rev = rem+rev * 10;
            n = n/10;
        }
        System.out.println(rev);




    }
}
