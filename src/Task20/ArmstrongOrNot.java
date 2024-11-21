package Task20;

import java.util.Scanner;

public class ArmstrongOrNot {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int rem = 0;
        int rev = 0;
        int sum = 0;
        int temp = n;
        while(n>0){
            rem = n % 10;
            sum = sum+ rem * rem * rem;
            n = n/10;
        }
        if(sum == temp){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not a armstong number");
        }
    }
}
