package javaInternet;

import java.math.BigInteger;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeInBuilt {

    public static void main(String[] args) {
        List<Integer> lt = IntStream.rangeClosed(1,100).boxed().collect(Collectors.toList());
        isCheckPrime(lt);
    }

    private static void isCheckPrime(List<Integer> lt) {
        System.out.println("The Prime Numbers are: ");
        long startTime = System.currentTimeMillis();

//        Predicate<Integer> integerPredicate = e -> {
//            BigInteger bigInteger = BigInteger.valueOf(e);
//            return bigInteger.isProbablePrime(1);
//        };

        //Consumer<Integer> println = System.out::println;

        lt.stream().filter(e->{
            BigInteger bigInteger = BigInteger.valueOf(e);
           return bigInteger.isProbablePrime(1);
        }).forEach(System.out::println);

        long endTime = System.currentTimeMillis();
        long runtime = endTime - startTime;
        System.out.println("Runtime: " + runtime + " milliseconds");
    }
}
