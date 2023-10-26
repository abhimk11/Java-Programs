package nextArray;

import java.util.Arrays;

public class SecondSmallest {

    static int getSecondSmallest(int[] arr){
        Arrays.sort(arr);
        return arr[1];
        }

    public static void main(String[] args) {

        int[] ar = {2,1,31,43,5,26,71};
        System.out.println(getSecondSmallest(ar));
    }
}
