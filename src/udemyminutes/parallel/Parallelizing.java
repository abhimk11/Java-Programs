package udemyminutes.parallel;

import java.util.stream.LongStream;

public class Parallelizing {
    public static void main(String[] args) {

        //It's way faster than normal stream
        System.out.println(LongStream.range(0,1000000000).parallel().sum());
        //0, 10000000000
        System.out.println(LongStream.range(0,1000000000).sum());


    }
}
