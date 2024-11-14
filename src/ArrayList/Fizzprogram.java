package ArrayList;

import java.util.Scanner;

public class Fizzprogram {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();
        for(int i = 1;i <= num;i++){
            if(i % 3 == 0 && i % 5 == 0 ){
                System.out.print("\"FizzBuzz\",");
            }
            else if(i % 3 == 0){
                System.out.print("\"Fizz\",");
            }
            else if(i % 5 == 0){
                System.out.print("\"Buzz\",");
            }
            else{
                System.out.print(i+",");
            }
 }
}
}