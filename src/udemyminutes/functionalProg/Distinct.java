package udemyminutes.functionalProg;

import java.util.List;

public class Distinct {
    public static void main(String[] args) {
        List<Integer> sq = List.of(2,2,4,31,134,331,12,3,4);

        sq.stream().distinct().forEach(System.out::println);
        System.out.println("-------------------------");
        sq.stream().sorted().forEach(System.out::println);

        System.out.println("-------------------------");

        List<String> courses =  List.of("Spring","Spring Boot","API","Microservice","AWS","PCF","Azure","Docker","Kubernetes");
        courses.stream().sorted().forEach(System.out::println);
    }
}
