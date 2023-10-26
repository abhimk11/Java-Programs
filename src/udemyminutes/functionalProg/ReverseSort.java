package udemyminutes.functionalProg;

import java.util.Comparator;
import java.util.List;

public class ReverseSort {
    public static void main(String[] args) {
        List<String> courses =  List.of("Spring","Spring Boot","API","Microservice","AWS","PCF","Azure","Docker","Kubernetes");
        courses.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        System.out.println("--------------");

        //sort using length
        courses.stream().sorted(Comparator.comparing(str->str.length())).forEach(System.out::println);
    }
}
