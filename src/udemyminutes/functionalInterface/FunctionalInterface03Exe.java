package udemyminutes.functionalInterface;

import java.util.List;
import java.util.Random;
import java.util.function.*;
import java.util.stream.Collectors;

//Behaviour Parameterization

public class FunctionalInterface03Exe {

    public static void main(String[] args) {
        List<Integer> lt = List.of(2, 4, 5, 6, 7, 8);

        List<Integer> SqNumbers = getNumbers(lt, x -> x * x);

        List<Integer> cubeNumbers = getNumbers(lt, x -> x * x * x);

        List<Integer> doubleNumbers = getNumbers(lt, x -> x + x);

        System.out.println(doubleNumbers);
        System.out.println(SqNumbers);
        System.out.println(cubeNumbers);

        Supplier<Integer> randomIntegerSupplier = () -> {
            Random random = new Random();
            return random.nextInt(1000);
        };

        System.out.println(randomIntegerSupplier.get());

        //Unary Operator takes in an input and use lambda expression and return the transformed data.
        UnaryOperator<Integer> unaryOperator = (x) -> 3 * x;
        System.out.println(unaryOperator.apply(10));
        System.out.println(unaryOperator.apply(randomIntegerSupplier.get()));

        //BiPredicate
        //Use biPredicate when you have two input in a lamda expression, and have to return a boolean back.
        BiPredicate<Integer, String> biPredicate = (number, str) -> {
            return number < 10 && str.length() > 5;
        };

        System.out.println(biPredicate.test(5, "india is a very good country"));

        //biFunction
        //Use biFunction when you have two input in a lamda expression, and have to return a return type.
        BiFunction<Integer, String, String> biFunction = (number, str) -> {
            return number + " " + str;
        };

        System.out.println(biFunction.apply(15, "Gamma"));

        //biConsumer
        //Use biConsumer when you have two two input in a lamda expression, and have processing such as print.
        BiConsumer<Integer, String> biConsumer = (s1, s2) -> {
            System.out.println(s1);
            System.out.println(s2);
        };

        biConsumer.accept(15, "World");

        //IntBinaryOperator uses primitive variables so it doesn't use wrapper or boxer class.
        //BinaryOperator uses wrapper class to use,so unboxing and boxing takes place which is inefficient.
        IntBinaryOperator intBinaryOperator = (x, y) -> x + y;
        BinaryOperator<Integer> binaryOperator = (x, y) -> x + y;

    }

    //BinaryOperator<Integer> (x,y) -> x+y, accepts two input and gives out one Output and all are of same Type.
    //Function<Integer,Integer> takes a input and return a output.
    //Predicate<Integer> takes an input and return a boolean.
    //Consumer<Integer> takes a input but doesn't return anything, it's best used for processing data such as printing.
    //Supplier<Integer> doesn't take any input but always return an output.
    private static List<Integer> getNumbers(List<Integer> lt, Function<Integer, Integer> Sqfunction) {
        return lt.stream().map(Sqfunction)
                .collect(Collectors.toList());
    }
}
