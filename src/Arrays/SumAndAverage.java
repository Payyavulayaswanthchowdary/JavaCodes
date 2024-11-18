package Arrays;

public class SumAndAverage {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,4,-43,-45,-34,9,345};
        int sum =0;
        int average = 0;
        for(int i = 0;i<array.length;i++){
            sum+=array[i];
        }
        System.out.println(sum);
        int a =array.length;
        average = (int) ((double)sum / (double)array.length);
        System.out.println(average);

    }
}
