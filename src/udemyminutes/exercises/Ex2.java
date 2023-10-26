package udemyminutes.exercises;

import java.util.List;

public class Ex2 {
    public static void main(String[] args) {
        List<Integer> cube = List.of(3,4,12,23,434,13,432,11,34,422,90);

        cube.stream().map(e->e*e*e).forEach(System.out::println);

        System.out.println("------------------");

        System.out.println(
                cube.stream().map(e->e*e*e).reduce(0,(x,y)->x+y)
        );
    }
}
