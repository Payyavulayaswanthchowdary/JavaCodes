package HackerRank;

import java.util.Scanner;

public class LargestProduct0Consecutive {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int [] arr = new int[n];
        int product =0;
        int i;
        int max = -99999;
        for( i = 0;i<n;i++){
            arr[i] = scr.nextInt();}
        if(n >= 2){
            for( i = 0;i<n-1;i++){
                product=arr[i] * arr[i+1];
                if(max < product){
                    max  = product;
                }
            }
            System.out.println(max);
        }
        else{
            System.out.println("List has fewer than two elements, so no consecutive product can be calculated.");
        }


    }
}
