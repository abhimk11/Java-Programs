package Mphasis;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BinaryNum {



    public static void main(String[] args) {
//       String binary = BinaryForm(5);
//        System.out.println(binary);

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Integer[] ar = new Integer[n];

        System.out.println("Enter Values: ");

        for (int i=0;i<n;i++){
            ar[i] = sc.nextInt();
        }

        //List<Integer> st = List.of(4,66,22,12,43,32);

        List<Integer> st = Arrays.asList(ar);

        List t = st.stream().map(Integer::toBinaryString).collect(Collectors.toList());
        System.out.println(t);
    }

//    private static String BinaryForm(int i) {
//        return Integer.toBinaryString(i);
//    }
}
