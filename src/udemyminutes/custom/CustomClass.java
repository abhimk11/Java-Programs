package udemyminutes.custom;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Course{
    private String name;
    private String category;
    private int reviewScore;
    private int noOfStudents;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getReviewScore() {
        return reviewScore;
    }

    public void setReviewScore(int reviewScore) {
        this.reviewScore = reviewScore;
    }

    public int getNoOfStudents() {
        return noOfStudents;
    }

    public void setNoOfStudents(int noOfStudents) {
        this.noOfStudents = noOfStudents;
    }

    public Course(String name, String category, int reviewScore, int noOfStudents) {
        this.name = name;
        this.category = category;
        this.reviewScore = reviewScore;
        this.noOfStudents = noOfStudents;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", reviewScore=" + reviewScore +
                ", noOfStudents=" + noOfStudents +
                '}';
    }
}

public class CustomClass {

    public static void main(String[] args) {

        List<Course> courses = List.of(
                new Course("Spring","Framework",98,2000),
                new Course("Spring Boot","Framework",95,1800),
                new Course("API","Microservices",97,2200),
                new Course("Microservices","Microservices",96,2500),
                new Course("FullStack","FullStack",91,1400),
                new Course("AWS","Cloud",92,2100),
                new Course("Azure","Cloud",99,2100),
                new Course("Docker","Cloud",92,2000),
                new Course("Kubernetes","Cloud",91,2000)
                );

        //allMatch, noneMatch, anyMatch
        Predicate<Course> coursePredicate = course -> course.getReviewScore() > 95;
        Predicate<Course> coursePredicate90 = course -> course.getReviewScore() > 90;
        Predicate<Course> coursePredicateLess90 = course -> course.getReviewScore() < 90;

        System.out.println(courses.stream().allMatch(coursePredicate));
        System.out.println(courses.stream().allMatch(coursePredicate90));

        //noneMatch
        System.out.println(courses.stream().noneMatch(coursePredicate));
        System.out.println(courses.stream().noneMatch(coursePredicateLess90));

        //anyMatch
        System.out.println(courses.stream().anyMatch(coursePredicate));
        System.out.println(courses.stream().anyMatch(coursePredicateLess90));

        //sorted

        Comparator<Course> comparatorByNoOfStudentsIncreasing = Comparator.comparing(Course::getNoOfStudents);
        Comparator<Course> comparatorByNoOfStudentsReverse = Comparator.comparing(Course::getNoOfStudents).reversed();
        Comparator<Course> comparatorByNoofStudentsAndReviews = Comparator.comparing(Course::getNoOfStudents).thenComparing(Course::getReviewScore).reversed();

        System.out.println(courses.stream().sorted(comparatorByNoOfStudentsIncreasing).collect(Collectors.toList()));
        System.out.println(courses.stream().sorted(comparatorByNoOfStudentsReverse).collect(Collectors.toList()));
        System.out.println(courses.stream().sorted(comparatorByNoofStudentsAndReviews).collect(Collectors.toList()));

        //top 5 courses
        System.out.println(courses.stream()
                .sorted(comparatorByNoofStudentsAndReviews)
                .limit(5).collect(Collectors.toList()));

        //skip top 3 results
        System.out.println(courses.stream()
                .sorted(comparatorByNoofStudentsAndReviews)
                .skip(3).collect(Collectors.toList()));

        System.out.println(courses.stream()
                .sorted(comparatorByNoofStudentsAndReviews)
                .skip(3)
                .limit(5)
                .collect(Collectors.toList()));

        System.out.println(courses);

        //Take while does upto the condtion and return it
        System.out.println(courses.stream()
                .takeWhile(course->course.getReviewScore()>=95)
                .collect(Collectors.toList()));

        //drop while Keep checking the conditon and if it true it will keep droping the elements, and when it finds a element that doesn't match
        //it takes all the elements subsequent to that.

        System.out.println(courses.stream()
                .dropWhile(course->course.getReviewScore()>=95)
                .collect(Collectors.toList()));

        //max & min
        //returns the last element
        System.out.println(
        courses.stream()
                .max(comparatorByNoofStudentsAndReviews));

        //returns the first element
        System.out.println(courses.stream()
                .min(comparatorByNoofStudentsAndReviews));

        System.out.println(
                courses.stream()
                        .filter(e->e.getReviewScore()>95)
                        .findFirst()
        );

        System.out.println(courses.stream()
                .filter(e->e.getReviewScore()>95)
                .findAny());

        //find the avg,count,sum
        System.out.println(
                courses.stream()
                        .filter(c -> c.getReviewScore() > 95)
                        .mapToInt(Course::getNoOfStudents)
                        .sum()); //88000

        System.out.println(
                courses.stream()
                        .filter(c->c.getReviewScore() > 95)
                        .mapToInt(Course::getNoOfStudents)
                        .average() //OptionalDouble[2200.0]
        );

        System.out.println(
                courses.stream()
                        .filter(c->c.getReviewScore() > 95)
                        .mapToInt(Course::getNoOfStudents)
                        .count() //4
        );

        System.out.println(
                courses.stream()
                        .filter(e->e.getReviewScore()>95)
                        .mapToInt(Course::getNoOfStudents)
                        .max() //OptionalInt[2500]
        );

        System.out.println(
                courses.stream()
                        .filter(e->e.getReviewScore()>95)
                        .mapToInt(Course::getNoOfStudents)
                        .min() //OptionalInt[2000]
        );

        System.out.println(
        courses.stream()
                .collect(Collectors.groupingBy(Course::getCategory)));

        System.out.println(
                courses.stream()
                        .collect(Collectors.groupingBy(Course::getCategory,Collectors.counting())) //count the number of items per category
        );

        System.out.println(
                courses.stream()
                        .collect(Collectors.groupingBy(Course::getCategory,Collectors.maxBy(Comparator.comparing(Course::getReviewScore))))
        );

        System.out.println(
                courses.stream()
                        .collect(Collectors.groupingBy(Course::getCategory,
                                Collectors.mapping(Course::getName,Collectors.toList())))
        );




     }

}
