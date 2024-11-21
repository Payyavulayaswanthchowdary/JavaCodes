package HackerRank;
import java.io.*;
import java.util.*;
public class PyamidOfOddNumbers {



        public static void main(String[] args) {
            Scanner scr = new Scanner(System.in);
            int n = scr.nextInt();
            int k = 1;
            for(int i = 1;i<=n;i++){
                for(int j = 1;j<=n-i;j++){
                    System.out.print(" ");
                }
                for(int m = 1;m<=i;m++){
                    System.out.print(k+" ");
                    k=k+2;
                }
                System.out.println("");
            }
        }
    }
