package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamImpl {

    static List<String> streamReturning(ArrayList<String> lt){
        //List<String> lt1 = lt.stream().filter(e->e.contains("a")).collect(Collectors.toList());
        //List<String> lt1 = lt.stream().sorted().collect(Collectors.toList());
        List<String> lt1 = lt.stream().map(e->e.toUpperCase()).collect(Collectors.toList());
        lt.stream().map(e->e.length()).forEach(System.out::println);//.forEach(e-> System.out.println(e));
        //long lt2 = lt.stream().count();
        //System.out.println(lt2);
        return lt1;
    }

    public static void main(String[] args) {
//        ArrayList<String> lt = new ArrayList<>(Arrays.asList("Abhi","Vikram","Krishank"));
//        System.out.println(streamReturning(lt));
        List<Integer> lt = List.of(3,4,5,6,42,44);
        int a = lt.stream().sorted().collect(Collectors.toList()).get(lt.size()-1);
        System.out.println(a);
    }
}
