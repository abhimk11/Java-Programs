package java8;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class countryMap {
    public static void main(String[] args) {

        int i = 400_34;
        System.out.println(i);
        //short i2 = i +10;

        Map<String,Integer> map = new HashMap<>();
        map.put("UK",67);
        map.put("USA",328);

        Map<String,Integer> unmodifiableMap = Collections.unmodifiableMap(map);
        map.put("India",45);
        System.out.println(unmodifiableMap);

    }
}
