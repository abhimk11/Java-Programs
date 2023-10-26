package udemyminutes.exercises;

import java.util.List;
import java.util.stream.Collectors;

public class Ex4 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
        List<Integer> result = EvenNumberList(numbers);
        System.out.println(result);
    }

    private static List<Integer> EvenNumberList(List<Integer> numbers) {
        return numbers.stream().filter(e->e%2==0).collect(Collectors.toList());
    }
}
