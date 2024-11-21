package HackerRank;
import java.io.*;
import java.util.*;
public class HourGlass {



        public static void main(String[] args) {
            Scanner scr = new Scanner(System.in);
            int n = scr.nextInt();
            for(int i = 1;i<=n;i++){
                for(int j = 1;j<=i-1;j++){
                    System.out.print(" ");
                }
                for(int j = 1;j<=n+1-i;j++){
                    System.out.print("* ");
                }
                System.out.println("");
            }
            for(int i = 1;i<=n-1;i++){
                for(int j = 2;j<=n-i;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=i+1;j++){
                    System.out.print("* ");
                }
                System.out.println("");
            }

        }
    }

