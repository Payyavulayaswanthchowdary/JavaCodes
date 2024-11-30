package HackerRank;

import java.util.Scanner;

public class FindCommonElements {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int [] arr = new int[n];
        for(int i = 0;i<n;i++)
            arr[i] = scr.nextInt();

        int m = scr.nextInt();
        int [] arr1 = new int[m];
        for(int j = 0;j<m;j++)
            arr1[j] = scr.nextInt();

        int i =0;
        int j =0;
        while(i<n && j<m){
            if(arr[i] == arr1[j]){
                System.out.println(arr[i]);
                i++;
                j++;
            }
            else{
                while(i<n && arr[i] < arr1[j])
                    i++;
                while(j<m && i<n && arr1[j] < arr[i])
                    j++;

            }
        }




    }
}
