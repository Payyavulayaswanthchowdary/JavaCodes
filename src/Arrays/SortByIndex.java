package Arrays;

import java.util.Arrays;

public class SortByIndex {
    public static void main(String[] args) {
        int [] arr = {11,2767,33,42,356};
        Arrays.sort(arr,1,3);
        System.out.println(Arrays.toString(arr));
    }
}
