package nextCollections;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VoterList {

    static List<Integer> votersList(Map<Integer, String> map) {

        List<Integer> lt = new ArrayList<>();

        for (Integer i : map.keySet()) {
            String dob = map.get(i);
            LocalDate localDate = LocalDate.parse(dob);
            LocalDate localDate1 = LocalDate.now();
            Period period = localDate.until(localDate1);
            int yearsBetween = period.getYears();
            if (yearsBetween >= 18) {
                lt.add(i);
            }
        }
        return lt;
    }

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(101, "2000-09-21");
        map.put(102, "2000-03-29");
        map.put(103, "2006-05-21");
        map.put(104, "2003-06-03");
        map.put(105, "2007-10-21");

        List<Integer> lt = votersList(map);
        System.out.println("The Voter List: " + lt);
    }
}
