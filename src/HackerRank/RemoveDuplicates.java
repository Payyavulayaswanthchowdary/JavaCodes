package HackerRank;
import java.io.*;
import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
            Scanner scr = new Scanner(System.in);
            int n = scr.nextInt();
            int [] arr = new int[10];
            for(int i = 0;i<n;i++)
                arr[i]=scr.nextInt();

            int count = 0;
            for(int i = 1;i<n;i++)
                if(arr[i] != arr[i-1])
                    count++;
            System.out.println(count+1);


        }
    }

