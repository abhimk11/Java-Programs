package Mphasis;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PrintAsecDsec {

    public static void main(String[] args) {
        List<Integer> lt = List.of(1,43,321,45,4,7,9,543);
        System.out.println("In ASEC: ");
        System.out.println(lt.stream().sorted().collect(Collectors.toList()));
        System.out.println("In DESC: ");
        System.out.println(lt.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
    }
}
