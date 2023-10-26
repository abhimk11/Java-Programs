package xtra;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayId {

    public static void main(String[] args) {

        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4}; //maxarray = [4,-1,2,1], sum=6
        int start1 = Integer.MIN_VALUE;
        int end2 = Integer.MAX_VALUE;
        int sum1 = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            int sum = arr[i];
            for (int j = i + 1; j < arr.length - 1; j++) {
                sum = sum + arr[j];
                if (sum > sum1) {
                    sum1 = sum;
                    start1 = i;
                    end2 = j;
                }
            }
        }

        System.out.println("SUM: " + sum1);
        for (int i = start1; i <= end2; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
