package nextCollections;

import java.util.*;

public class SortedHashMap {
    public static List<String> getValues(HashMap kt) {
        List<String> sortedValues = new ArrayList<>(kt.values());
        Collections.sort(sortedValues);
        return sortedValues;
    }

    public static void main(String[] args) {

        HashMap<Integer, String> kt = new HashMap<>();
        kt.put(1, "Apple");
        kt.put(2, "Orange");
        kt.put(3, "Alpha");
        kt.put(4, "Omega");

        List<String> gt = getValues(kt);
        System.out.println(gt);

    }
}
