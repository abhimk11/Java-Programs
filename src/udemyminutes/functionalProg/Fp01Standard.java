package udemyminutes.functionalProg;

import java.util.List;

public class Fp01Standard {
    public static void main(String[] args) {
        printAllNumbersInListStructure(List.of(12,9,13,4,6,2,4,12,15));
        printAllNumbersInListFunctional(List.of(12,9,13,4,6,2,4,12,15));
        printAllEvenNumbersInListFunctional(List.of(12,9,13,4,6,2,4,12,15));
    }

    private static void print(int number){
        System.out.println(number);
    }
    private static void printAllNumbersInListFunctional(List<Integer> integers) {
        integers.stream().forEach(Fp01Standard::print);
        integers.stream().filter(e ->e%2==0).forEach(System.out::println);
    }

    private static void printAllEvenNumbersInListFunctional(List<Integer> integers) {
        integers.stream().filter(e ->e%2==0).map(e->e*e).forEach(System.out::println);
    }

    //standard approach
    private static void printAllNumbersInListStructure(List<Integer> integers) {
        for (Integer i:integers){
            System.out.println(i);
        }
    }
}
