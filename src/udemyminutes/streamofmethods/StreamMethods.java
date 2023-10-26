package udemyminutes.streamofmethods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMethods {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);

        System.out.println(Stream.of(12,9,13,4,6,2,4,12,15).count());

        System.out.println(Stream.of(12,9,13,4,6,2,4,12,15).reduce(0,Integer::sum));

        int[] numberArray = {12,9,13,4,6,2,4,12,15};

        System.out.println(Arrays.stream(numberArray).sum());
        System.out.println(Arrays.stream(numberArray).average());
        System.out.println(Arrays.stream(numberArray).max());
        System.out.println(Arrays.stream(numberArray).min());
    }
}
