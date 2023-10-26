package udemyminutes.streamofmethods;

import java.math.BigInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class StreamMethod2 {
    public static void main(String[] args) {

        System.out.println(IntStream.range(1,10).sum());

        System.out.println(IntStream.rangeClosed(1,10).sum());

        System.out.println(IntStream.iterate(1,e->e+2).limit(10).peek(System.out::println).sum());
        System.out.println("-----");
        System.out.println(IntStream.iterate(2,e->e+2).limit(10).peek(System.out::println).sum());
        System.out.println("-----");
        System.out.println(IntStream.iterate(2,e->e*2).limit(10).peek(System.out::println).sum());
        System.out.println("-----");
        System.out.println(IntStream.iterate(2,e->e*2).limit(10).boxed().collect(Collectors.toList()));
        //Values in IntStream are primitive so we need to boxed or wrapped them first then we can use collector.toList in them.

        System.out.println(LongStream.rangeClosed(1,50).reduce(1L,(x, y)->x*y));

        //Multiply using BigInteger
        System.out.println(LongStream.rangeClosed(1,50).mapToObj(BigInteger::valueOf).reduce(BigInteger.ONE,BigInteger::multiply));



    }
}
