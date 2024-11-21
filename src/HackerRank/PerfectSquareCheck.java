package HackerRank;
import java.io.*;
import java.util.*;
public class PerfectSquareCheck {




        public static void main(String[] args) {
            Scanner scr = new Scanner(System.in);
            int n = scr.nextInt();
            int i;
            for( i = 1;i*i<=n;i++);
            i = i-1;
            if(i*i== n){
                System.out.println("yes");
            }
            else{
                System.out.println("no");

            }

        }
    }

