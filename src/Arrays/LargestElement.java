package Arrays;



public class LargestElement {
    public static void main(String[] args) {

        int [] a = {10,4,2,78,93,283,87345};
        int max =a[0];
       for(int i =1;i<a.length;i++){
           if(max < a[i]){
               max=a[i];
           }

       }
       System.out.println(max);
    }
}
