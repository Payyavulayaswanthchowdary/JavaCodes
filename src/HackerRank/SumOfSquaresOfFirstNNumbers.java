package HackerRank;
import java.io.*;
import java.util.*;
public class SumOfSquaresOfFirstNNumbers {



        public static void main(String[] args) {
            Scanner scr = new Scanner(System.in);
            int n = scr.nextInt();
            int sum =0;
            for(int i =1;i<=n;i++){
                sum+=(i * i);
            }
            System.out.println(sum);
        }
    }

