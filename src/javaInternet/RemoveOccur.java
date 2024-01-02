package javaInternet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RemoveOccur {

    public static int[] OccuranceRemove(int[] a,int n){

        Arrays.sort(a);
        ArrayList<Integer> ab =  new ArrayList<>();
        for (int i=0;i<a.length;i++){
            if (a[i]!=n) {
                ab.add(a[i]);
            }
        }

        int[] result = new int[ab.size()];
        for (int i=0;i<ab.size();i++){
            result[i]=ab.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number to be Removed: ");
        int n = sc.nextInt();
        int[] a = {1,2,3,4,5,1,1,3,5};
        int[] b = OccuranceRemove(a,n);
        for (int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }
    }
}
