package Mphasis;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountCharacter {
    public static void main(String[] args) {
        String st = "mphasis freshers to experience";
        CountTheCharacter(st);
    }

    private static void CountTheCharacter(String st) {
        st = st.replaceAll(" ","").toLowerCase();

        Map<Character,Long> charCount = st.chars()
                .mapToObj(c->(char) c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(charCount);
    }
}
