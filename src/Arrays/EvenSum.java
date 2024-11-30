package Arrays;

public class EvenSum {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,6};
        int sum = 0;
        for(int i = 0;i<=arr.length-1;i++){
            if(arr[i] % 2 == 0){
                sum+=arr[i];
            }
        }
        System.out.println(sum);
    }
}


