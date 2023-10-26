package Try;

//findout whose sal is lowest ,his details

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //LocalDateTime localDateTime = LocalDateTime.now();
        List<Employee> lt  = new ArrayList<>();
       // Employee employee0 = new Employee(1,500,"Abhi","DC", LocalDateTime.now());
        Employee employee1 = new Employee(1,500,"Abhi","DC", LocalDateTime.now());
        Employee employee2 = new Employee(1,5000,"Abhi1","DC", LocalDateTime.now());
        Employee employe3 = new Employee(1,5003,"Abhi23","DC", LocalDateTime.now());
        Employee employe4 = new Employee(1,50055,"Abhi343","DC", LocalDateTime.now());
        Employee employee5 = new Employee(1,50220,"Abhi4332","DC", LocalDateTime.now());
        lt.add(employee1);
        lt.add(employee2);
        lt.add(employe3);
        lt.add(employe4);
        lt.add(employee5);

        Employee obj = lt.stream().sorted(Comparator.comparing(e->e.getSal())).collect(Collectors.toList()).get(0);
       // Employee obj1 = lt.stream().collect(Collectors.minBy(Comparator.comparing(Employee::getSal))).get();
        System.out.println(obj);
        long c = lt.stream().count();
        System.out.println(c);
        System.out.println("-------------------");
        lt.stream().map(e->e.getName().length()).forEach(System.out::println);
        System.out.println(lt.stream().collect(Collectors.minBy(Comparator.comparingInt(Employee::getSal))));
    }
}
