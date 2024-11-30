package Exceptions;

import java.util.Scanner;

public class ArrayIOException {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int [] n1 = {1,3,4};
        int indx = 1;
        if(indx >=0 && indx<n1.length){
            System.out.println(n1[indx]);
        }
        else{
            System.out.println("Enter the index with in range.");
        }

    }

}
