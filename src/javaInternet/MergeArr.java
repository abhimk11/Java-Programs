package javaInternet;

import java.util.ArrayList;

public class MergeArr {

    public static int[] MergeingArr(int[] a,int[] b){
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        for (int i:a){a1.add(i);}
        ArrayList<Integer> a2 = new ArrayList<Integer>();
        for (int i:b){a2.add(i);}
        for(Integer i:a2)
        {a1.add(i);}
        int[] result = new int[a1.size()];
        for (int i=0;i<result.length;i++){
            result[i]= a1.get(i);
        }
        return result;
    }

    public static void main(String[] args) {

        int[] a={1,2,3,4};
        int[] b = {5,6};
        int[] c= MergeingArr(a,b);
        for (int i=0;i<c.length;i++){
            System.out.println(c[i]);
        }
    }
}
