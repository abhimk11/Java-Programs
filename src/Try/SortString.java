package Try;

import java.util.Arrays;
import java.util.Collections;

public class SortString {
    public static void main(String[] args) {
        String[] s= {"Capgemini","Accenture","TCS","EPAM"};
        Arrays.stream(s).sorted().forEach(System.out::println);
        System.out.println("-----------------");
        Arrays.sort(s);
        for (String abc:s){
            System.out.println(abc);
        }
    }


}
