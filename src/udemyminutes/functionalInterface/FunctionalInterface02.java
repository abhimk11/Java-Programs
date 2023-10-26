package udemyminutes.functionalInterface;

import java.util.List;
import java.util.function.BinaryOperator;

public class FunctionalInterface02 {
    public static void main(String[] args) {
        List<Integer> lt = List.of(2,3,4,5,6,7,8,9);

        BinaryOperator<Integer> sum = Integer::sum;

        BinaryOperator<Integer> sum1 = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer+integer2;
            }
        };

        int n = lt.stream().reduce(0, sum1);
        System.out.println(n);
    }
}
