package Mphasis;

import java.util.List;

public class RemoveDupli {
    public static void main(String[] args) {
        List<Integer> lt = List.of(1,2,3,4,1,2,3);
        RemoveDuplicate(lt);
    }

    private static void RemoveDuplicate(List<Integer> lt) {
        lt.stream().distinct().forEach(System.out::println);
    }
}
