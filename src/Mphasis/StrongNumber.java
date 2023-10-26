package Mphasis;

import java.util.ArrayList;
import java.util.List;

public class StrongNumber {

    public static void main(String[] args) {
        int a = 1;
        int b = 999;

        List<Integer> lt = checkStrongNumber(a,b);
        System.out.println(lt);
    }

    private static List<Integer> checkStrongNumber(int a, int b) {

        List<Integer> lt = new ArrayList<>();
        for (int j=a;j!=b;j++) {
            int sum=0;
            int count = j;
            while(count!=0) {
                int num = count % 10;
                int k = 1;
                for (int i = 1; i <= num; i++) {
                    k = k * i;
                }
                sum = sum + k;
                count=count/10;
            }
            if (sum == j) {
                lt.add(j);
            }
        }
        return lt;
    }
}
