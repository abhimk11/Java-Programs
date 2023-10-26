package Mphasis;

import java.util.List;

public class LowestAndHighest {
    public static void main(String[] args) {
        List<Integer> lt = List.of(1,2,3,77,6,5);
        LowestHighest(lt);
    }

    private static void LowestHighest(List<Integer> lt) {
        Integer low = lt.stream().reduce(Integer.MAX_VALUE,(x,y)->x>y?y:x);
        Integer high = lt.stream().reduce(Integer.MIN_VALUE,(x,y)->x<y?y:x);
        System.out.println("Lowest is: " + low);
        System.out.println("Highest is: " + high);
    }
}
