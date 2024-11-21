package HackerRank;
import java.io.*;
import java.util.*;
public class PrimeFactorization {
    public class Solution {

        public static boolean isPrime(int n){
            if(n == 2 || n == 3)
                return true;
            if(n%2 == 0 || n%3 ==0)
                return false;
            for(int i = 5;i*i<=n;i++)
                if(n % i ==0 || n%(i+2) == 0)
                    return false;
            return true;
        }
        public static void main(String[] args) {
            Scanner scr = new Scanner(System.in);
            int n = scr.nextInt();
            for(int i =2;i<=n;i++){
                if(Solution.isPrime(i)){
                    int dup = n;
                    while(dup>0){
                        if(dup%i == 0){
                            System.out.println(i);
                            dup/=i;
                        }
                        else
                            break;
                    }
                }
            }




        }
    }
}
