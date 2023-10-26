package nextCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SecondSmallest {

    static int getSecondSmallest(int[] arr){

        //List ar1 = new ArrayList<>();
        /*List<Integer> ar = Arrays.asList(arr.);
        Collections.sort(ar);
        Integer[] ab = new Integer[ar.size()];
               ab = ar.toArray(ab);*/
        //int a = ar.get(1);
        List<Integer> ar1 = new ArrayList<Integer>();
        for (int i:arr){
            ar1.add(i);
        }
        Collections.sort(ar1);
        Integer[] ab = new Integer[ar1.size()];
        ab = ar1.toArray(ab);
        return ab[1];
    }

    public static void main(String[] args) {

        int[] arr = {33,4,34,2,322,10,5,90};
        System.out.println("The Second Smallest: " + getSecondSmallest(arr));
    }
}
