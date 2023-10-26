package udemyminutes.streamofmethods;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FlatMapMethods {
    public static void main(String[] args) {

        List<String> courses = List.of("Spring","Spring Boot","API","Microservices","AWS","PCF","Azure","Docker","Kubernetes");
        System.out.println(courses.stream().collect(Collectors.joining(",")));

        List<Integer> lt = List.of(2,4,5,6,7,8,3,78);
        Optional<Integer> lt1 = lt.stream().min(Integer::compare);
        System.out.println(lt1.get());

        System.out.println(courses.stream().map(course->course.split("")).collect(Collectors.toList()));//It's a stream of stream array
        System.out.println(courses.stream().map(course->course.split("")).flatMap(Arrays::stream).collect(Collectors.toList())); //flatmap to print all the characters
        System.out.println(courses.stream().map(course->course.split("")).flatMap(Arrays::stream).distinct().collect(Collectors.toList()));

        List<String> courses2 = List.of("Spring","Spring Boot","API","Microservices","AWS","PCF","Azure","Docker","Kubernetes");

        System.out.println(courses.stream().flatMap(course ->courses2.stream().map(course2->List.of(course,course2))).collect(Collectors.toList()));

        System.out.println(courses.stream().flatMap(course ->courses2.stream().map(course2->List.of(course,course2))).filter(list->!list.get(0).equals(list.get(1))).collect(Collectors.toList()));




    }
}
