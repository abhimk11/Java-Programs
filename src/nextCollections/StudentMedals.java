package nextCollections;

import java.util.HashMap;
import java.util.Map;

public class StudentMedals {

    static HashMap<Integer, String> getStudents(HashMap<Integer, Integer> medalType) {

        HashMap<Integer, String> map = new HashMap<>();

        for (int i : medalType.keySet()) {
            //if (medalType.containsKey(i)){
            // int mark = 0;
            // mark = medalType.get(i);
            if (medalType.get(i) >= 90) {
                map.put(i, "GOLD");
            } else if (medalType.get(i) >= 80 && medalType.get(i) < 90) {
                map.put(i, "SILVER");
            } else if (medalType.get(i) >= 70 && medalType.get(i) < 80) {
                map.put(i, "BRONZE");
            } else {
                map.put(i, "NO MEDAL AWARDED");
            }
            //  }
        }

        return map;

    }

    public static void main(String[] args) {

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 78);
        map.put(2, 94);
        map.put(3, 86);
        map.put(4, 77);
        map.put(5, 68);

        HashMap<Integer, String> MedalList = getStudents(map);
        for (Map.Entry<Integer, String> entry : MedalList.entrySet()) {
            System.out.println("Registration Number: " + entry.getKey() + ", Medal Awarded: " + entry.getValue());
        }

    }
}
