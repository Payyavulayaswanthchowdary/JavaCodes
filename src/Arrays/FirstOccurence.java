package Arrays;

public class FirstOccurence {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,6,7,4,2};
        int ele = 2;
        int indx = 0;
        for(int i = 0;i<=arr.length-1;i++){
            if(ele == arr[i]){
                indx = i;
                //break; // if we did not give break statement then we get the last index if we have duplicate to given element
                System.out.println(indx);// if we declare print statement inside loop without break then we get all occurences.
            }

        }

    }
}
