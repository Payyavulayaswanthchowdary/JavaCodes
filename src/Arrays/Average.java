package Arrays;

public class Average {
    public static void main(String[] args) {
        int [] a ={1,2,3,4,5,6,7,8,9,10};
        int sum =0;
        int average =0;
        for(int i =0;i<a.length;i++){
            sum+=a[i];
        }

        average = ( sum / a.length );
        System.out.println(average);
    }

}
