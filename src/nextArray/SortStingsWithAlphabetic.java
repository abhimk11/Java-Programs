package nextArray;


import java.util.Arrays;

public class SortStingsWithAlphabetic {
    static String[] sortStrings(String[] arr){
        Arrays.sort(arr);
        int n= arr.length;
        if (n%2==0){
            for (int i=0;i<arr.length/2;i++){
                arr[i] = arr[i].toUpperCase();
            }
            for (int i=arr.length/2;i<arr.length;i++){
                arr[i] = arr[i].toLowerCase();
            }
        }
        else {
            for (int i=0;i<(arr.length/2)+1;i++){
                arr[i] = arr[i].toUpperCase();
            }
            for (int i=(arr.length/2)+1;i<arr.length;i++){
                arr[i] = arr[i].toLowerCase();
            }
        }
        return arr;
    }

    public static void main(String[] args) {

        String[] ar = {"Omega","Beta","Gamma","Charlie","Alpha","Zeta","MK"};
        String[] ak = sortStrings(ar);
        for (int i=0;i<ak.length;i++){
            System.out.println(ak[i]);
        }
    }
}
