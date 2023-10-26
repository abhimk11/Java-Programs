package udemyminutes.functionalInterface;

import java.util.List;
import java.util.function.Supplier;

public class MethodReferences01 {

    public static void main(String[] args) {
        List<String> st = List.of("Spring","Spring Boot","API","Microservices","AWS",
                "PDF","Azure","Docker","Kubernetes");

        st.stream().map(String::toUpperCase).forEach(System.out::println);

        Supplier<String> stringSupplier = String::new;
    }
}
