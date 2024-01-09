package java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class fact8 {
    public static void main(String[] args) {
        //Integer fact = IntStream.rangeClosed(1, 5).reduce(1, (x, y) -> x * y);
        //System.out.println(fact);
        List<Integer> lt = Arrays.asList(1, 2, 3, 4, 5, 1, 2, 4, 5);
        List<Integer> k = lt.stream().sorted().collect(Collectors.toList());
        System.out.println(k);
//        Set<Integer> set = new HashSet<>();
//        Set<Integer> set1 = new HashSet<>();
//        for (int i:lt){
//            if (!set.add(i)){
//                set1.add(i);
//            }
//        }
//        System.out.println(set1);
    }
}
