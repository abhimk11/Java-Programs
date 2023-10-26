package udemyminutes.exercises;

import java.util.List;

public class Ex1 {
    public static void main(String[] args) {
        List<Integer> sq = List.of(2,43,44,21,213,23,211,32,45,90);

        sq.stream().map(e->e*e).forEach(System.out::println);
        System.out.println("------------");

        int n = sq.stream().map(e->e*e).reduce(0,(x,y)->x+y);
        System.out.println(n);
    }
}
