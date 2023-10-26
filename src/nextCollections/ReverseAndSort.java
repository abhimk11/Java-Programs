package nextCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseAndSort {

    static int[] getSorted(int[] arr) {

        List<Integer> lt = new ArrayList<Integer>();
        int[] arr2 = new int[arr.length];
        int k = 0;
        for (int i : arr) {
            String s = Integer.toString(i);
            StringBuilder stringBuilder = new StringBuilder(s);
            stringBuilder.reverse();
            arr2[k] = Integer.parseInt(stringBuilder.toString());
            k++;
        }
        Arrays.sort(arr2);
        return arr2;
    }

    public static void main(String[] args) {

        int[] arr = {1, 45, 68, 34, 32, 67, 98, 21, 73};
        int[] arr1 = getSorted(arr);
        System.out.println("The Resultant List: ");
        for (int i : arr1) {
            System.out.println(i);
        }
    }
}
