package udemyminutes.exercises;

import java.util.List;
import java.util.stream.Collectors;

public class Ex5 {

    public static void main(String[] args) {
        List<String> courses =  List.of("Spring","Spring Boot","API","Microservice","AWS","PCF","Azure","Docker","Kubernetes");

        List<Integer> results = LengthOfCourse(courses);

        System.out.println(results);
    }



    private static List<Integer> LengthOfCourse(List<String> courses) {
        return courses.stream().map(e->e.length()).collect(Collectors.toList());
    }
}
