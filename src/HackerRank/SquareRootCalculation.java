package HackerRank;
import java.io.*;
import java.util.*;
public class SquareRootCalculation {



        public static void main(String[] args) {
            Scanner scr = new Scanner(System.in);
            int n = scr.nextInt();
            int i;
            for( i =1;i * i<=n;i++);

            System.out.println(i-1);
        }
    }

