package Mphasis;

import java.util.List;

public class Cube {
    public static void main(String[] args) {
        List<Integer> lt = List.of(4,5,6,7,1,2,3);
        CubeAndGreater(lt);

    }

    private static void CubeAndGreater(List<Integer> lt) {
        lt.stream().map(e->e*e*e).filter(e->e>50).forEach(System.out::println);
    }
}
