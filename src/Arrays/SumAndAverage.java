package Arrays;

public class SumAndAverage {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,4,43,45,34,9,345,22};
        int sum =0,average = 0;
        for(int i = 0;i<array.length;i++){
            if(array[i] % 2 == 0){
                sum=sum + (array[i]);

            }
        }
        //int a =array.length;
        average = (int) (sum / array.length);
        System.out.println(average);

    }
}
