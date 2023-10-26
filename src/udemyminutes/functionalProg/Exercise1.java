package udemyminutes.functionalProg;

import java.util.List;

public class Exercise1 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12,9,13,4,6,2,12,15);
        printAllOddNumbersInListFunctional(numbers);
        printAllCubeOfOddNumbersInListFunctional(numbers);

        List<String> courses =  List.of("Spring","Spring Boot","API","Microservice","AWS","PCF","Azure","Docker","Kubernetes");
        printAllCourses(courses);
        printNumberAllCourses(courses);
        printWithSpringCourses(courses);
        printAtleast4Courses(courses);
    }
    private static void printAllOddNumbersInListFunctional(List<Integer> integers) {
        integers.stream().filter(e ->e%2==1).forEach(System.out::println);
    }

    private static void printAllCubeOfOddNumbersInListFunctional(List<Integer> integers) {
        integers.stream().filter(e ->e%2==1).map(e->e*e*e).forEach(System.out::println);
    }

    private static void printAllCourses(List<String> courses){
        courses.stream().forEach(System.out::println);
    }

    private static void printNumberAllCourses(List<String> courses){
        courses.stream().map(e->e.length()).forEach(System.out::println);
    }

    private static void printWithSpringCourses(List<String> courses){
        System.out.println("-----------");
        courses.stream().filter(e->e.contains("Spring")).forEach(System.out::println);
    }

    private static void printAtleast4Courses(List<String> courses){
        System.out.println("--------------");
        courses.stream().filter(e->e.length()>=4).forEach(System.out::println);
    }


}
