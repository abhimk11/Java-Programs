package udemyminutes.functionalInterface;

import java.util.List;
import java.util.function.Predicate;

public class FunctionalInterface03 {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);

        extracted(numbers, x1 -> x1 % 2 == 0);

        System.out.println();

        extracted(numbers, x -> x % 2 != 0);

    }

    private static void extracted(List<Integer> numbers, Predicate<Integer> predicate) {
        numbers.stream().filter(predicate)
                .forEach(System.out::println);
    }
}
