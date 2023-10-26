package java8;

import java.util.*;
import java.util.stream.Collectors;

public class Greater {
    public static void main(String[] args) {
        ArrayList<String> st = new ArrayList<String>();
        st.add("Hayabusa");
        st.add("Kagura");
        st.add("Hanzo");
        st.add("Hanabi");

        List<Integer> ct = List.of(3,5,9,4,6,8);
        List<Integer> ct1 = new ArrayList<>();

        ct1 = ct.stream().filter(n->n%2==0).map(e->e*e).collect(Collectors.toList());
        System.out.println(ct1);

        List<Integer> in = Arrays.asList(1,2,3,4,6);
        List<String> st1 = new ArrayList<>();

        //filter operation
        st1 = st.stream().filter(e->e.contains("H")).collect(Collectors.toList());

        //map operation
        st1 = st.stream().map(e->e.toUpperCase()).sorted().collect(Collectors.toList());

        //reduce operation
        int mul = in.stream().reduce(1,(x,y)->x*y);

        System.out.println(mul);

        Collections.reverse(st);
        System.out.println(st);

        String[] ab = {"abhi","mk","abc"};
        Arrays.sort(ab);
        for (String a: ab){
        System.out.println(a);

            List<Integer> st12 = Arrays.asList(1, 2, 3, 4, 5, 6);
            int ak = st12.stream().reduce(0,(x,y)->x+y);
            Optional<Integer> kl =st12.stream().reduce(Integer::min);
            System.out.println(kl.get());


        }
    }
}
