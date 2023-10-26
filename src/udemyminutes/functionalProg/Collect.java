package udemyminutes.functionalProg;

import java.util.List;
import java.util.stream.Collectors;

public class Collect {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
        List<Integer> doubleNumbers = doubleList(numbers);
        System.out.println(doubleNumbers);
    }

    private static List<Integer> doubleList(List<Integer> numbers) {
        return numbers.stream().map(e->e*e).collect(Collectors.toList());
    }
}
