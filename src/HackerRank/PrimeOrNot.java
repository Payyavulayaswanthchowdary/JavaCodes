package HackerRank;

import java.util.Scanner;

public class PrimeOrNot {
    public static int isPrime(int n){
        if(n == 2 || n == 3)
            return 1;
        if(n%2 == 0 || n%3 ==0)
            return 0;
        for(int i = 2;i*i<=n;i++)
            if(n % i ==0)
                return 0;
        return 1;

    }

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        if(PrimeOrNot.isPrime(n) == 1)
            System.out.println("Prime numbr");
        else
            System.out.println("not Prime numbr");

    }
}
