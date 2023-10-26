package Mphasis;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListPrime {
    public static void main(String[] args) {
        List<Integer> ct = listAllPrime(1000);
        System.out.println(ct);
    }

    private static List<Integer> listAllPrime(int i) {
        List<Integer> ct = new ArrayList<>();
        for(int j=1;j<=i;j++){
            ct.add(j);
        }
        List<Integer> kt = ct.stream().filter(ListPrime::checkPrime).collect(Collectors.toList());
        return kt;
    }

    private static boolean checkPrime(Integer integer) {
        int count = 0;
        for (int i = 1; i <= integer; i++) {
            if (integer % i == 0) {
                count++;
            }
        }
        if (count==2){return true;}
        return false;
    }

}
