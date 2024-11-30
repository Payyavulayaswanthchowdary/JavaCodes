package HackerRank;

import java.util.Scanner;

public class Dotproduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum =0;
        int [] arr = new int[n];
        for(int i = 0;i<=arr.length-1;i++){
            arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();

        int [] arr1 = new int[m];
        for(int i = 0;i<=arr1.length-1;i++){
            arr1[i] = sc.nextInt();
        }
        for(int i = 0;i<=arr.length-1;i++){
            sum+=(arr[i] * arr1[i]);
        }
        System.out.println(sum);

    }
}
