package nextArray;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDupli {

    static int[] modifyArray(int[] ar) {

        Set<Integer> st = new HashSet<>();
        for (int i=0;i<ar.length;i++){
            st.add(ar[i]);
        }
        
        List<Integer> lt =  st.stream().collect(Collectors.toList());
        Collections.sort(lt,Collections.reverseOrder());
        Integer [] arr= lt.stream().toArray(Integer[]::new);
        int[] ag = new int[arr.length];
        for (int i=0;i<arr.length;i++){
            ag[i]=arr[i].intValue();
        }
        return ag;
    }


    public static void main(String[] args) {

        int[] ar = {21,21,33,43,23,45};
        int[] ag = modifyArray(ar);
        for (int i=0;i<ag.length;i++){
            System.out.println(ag[i]);
        }

    }
}
