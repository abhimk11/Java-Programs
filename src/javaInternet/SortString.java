package javaInternet;

import java.util.Arrays;

public class SortString {

    public static String Stringsorter(String s){

        char[] res = s.toCharArray();
        Arrays.sort(res);
        return new String(res);
    }

    public static void main(String[] args) {

        String s ="Hello World";
        String s1 = Stringsorter(s);
        System.out.println(s1);
    }
}
