package udemyminutes;

import java.util.List;

public class Fp02Structured {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);
        int sum = addListStructured(numbers);
        System.out.println(sum);
    }

    private static int sum(int a,int b)
    {return a+b;}
    private static int addListStructured(List<Integer> numbers) {
        //return numbers.stream().reduce(0,(e,y)->e+y);
        //return numbers.stream().reduce(0,Fp02Structured::sum);
        //return numbers.stream().reduce(Integer.MIN_VALUE,(x,y)-> x<y ? y:x); //max_number
        return numbers.stream().reduce(Integer.MAX_VALUE,(x,y)->x>y ? y:x); //min_number
    }
}
