package udemyminutes.exercises;

import java.util.List;

public class Ex3 {
    public static void main(String[] args) {

        List<Integer> odd = List.of(2,3,4,5,99,14,15,16,24,22,54,63,34);

        odd.stream().filter(e->e%2==1).forEach(System.out::println);

        System.out.println("-------------------");

        System.out.println(
                odd.stream().filter(e->e%2==1).reduce(0,(x,y)->x+y)
        );
    }
}
