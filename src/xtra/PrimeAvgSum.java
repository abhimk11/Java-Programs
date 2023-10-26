package xtra;

import java.util.ArrayList;
import java.util.List;

public class PrimeAvgSum {

//    public static int sumOfPrime(int a){
//        return null;
//    }
//
//    public static Double avgOfPrime(int a){
//        return null;
//    }

    public static boolean isPrime(int a){
        int count =0;
        for (int i=1;i<=a;i++){
            if (a%i==0){
                count++;
            }
        }
        if (count==2){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        List<Integer> st = new ArrayList<>();
//        long count=0;
//        int sum =0;
        for (int i=1;i<=100;i++){
            boolean t = false;
            t = isPrime(i);
            if (t){
                st.add(i);
            }
        }

        int sum = st.stream().reduce(0,(x,y)->x+y);
        long count = st.stream().count();
        long avg = sum/count;

        System.out.println(st);
        System.out.println("Sum: "+sum);
        System.out.println("Count: "+count);
        System.out.println("Avg: "+avg);
    }
}
