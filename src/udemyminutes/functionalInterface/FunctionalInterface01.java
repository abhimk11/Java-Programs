package udemyminutes.functionalInterface;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalInterface01 {
    public static void main(String[] args) {
        List<Integer> lt = List.of(12,9,13,4,6,2,6,12,15);

        Predicate<Integer> integerPredicate = x -> x % 2 == 0;
        Function<Integer, Integer> integerIntegerFunction = x -> x * x;
        Consumer<Integer> println = System.out::println;

        lt.stream().filter(integerPredicate)
                .map(integerIntegerFunction)
                .forEach(println);
    }
}
