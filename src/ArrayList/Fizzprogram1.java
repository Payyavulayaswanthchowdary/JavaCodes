package ArrayList;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Fizzprogram1 {

    public static List<String> fizzBuzz(int n) {
            List<String> answer = new ArrayList<>();

            for (int i = 1; i <= n; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    answer.add("\"FizzBuzz\",");
                } else if (i % 3 == 0) {
                    answer.add("\"Fizz\",");
                } else if (i % 5 == 0) {
                    answer.add("\"Buzz\",");
                } else {
                    answer.add(String.valueOf(i));
                }
            }
            return answer;
        }
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            int n = sc.nextInt(); // You can change this value to test with different inputs
            List<String> result = fizzBuzz(n);
            System.out.println(result);
}
}

