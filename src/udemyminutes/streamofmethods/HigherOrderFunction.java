package udemyminutes.streamofmethods;

import java.util.ArrayList;
import java.util.List;

public class HigherOrderFunction {
    public static void main(String[] args) {
        List<String> courses = List.of("Spring","Spring Boot","API","Microservices","AWS","PCF","Azure","Docker","Kubernetes");

        for (String c:courses){
            System.out.println(c);
        }

        System.out.println(courses.stream().filter(course->course.length()>11).map(String::toUpperCase).findFirst());

        List<String> modifiable = new ArrayList(courses);
        modifiable.replaceAll(s -> s.toUpperCase());
        System.out.println(modifiable);

        modifiable.removeIf(s -> s.length()<6);
        System.out.println(modifiable);

    }
}
