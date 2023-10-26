package Try;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Cube {
    public static void main(String[] args) {
        List<Integer> lt = List.of(11,4,32,45,22,123,8);
        List<Integer> lt1 = new ArrayList<>(Arrays.asList(2,34,5,23,32));

        Optional<Integer> k =lt.stream().map(e->e*e*e).reduce((x, y)->x+y);
        System.out.println(k.get());
        // System.out.println(k);
    }
}
