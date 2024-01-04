package Try;

import java.util.*;

public class OnlyDuplicates {
    public static void main(String[] args) {

        List<Integer> lt = Arrays.asList(1, 34, 32, 1, 45, 56, 56, 43, 2, 3, 2);

        Set<Integer> set = new HashSet<>();
        Set<Integer> set1 = new HashSet<>();

        for (int i : lt) {
            if (!set.add(i)) {
                set1.add(i);
            }
        }

        System.out.println(set1);
    }
}
