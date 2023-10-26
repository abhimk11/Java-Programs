package nextCollections;

import java.util.HashMap;
import java.util.Map;

public class SquareHashMap {

    static Map<Integer,Integer> getSquares(int[] k){

        Map<Integer,Integer> map = new HashMap<>();
        for (int num:k){
            map.put(num,num*num);
        }
        return map;
    }


    public static void main(String[] args) {
        int[] arr = {2,3,4,5};
        Map<Integer,Integer> map = getSquares(arr);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println("Number: " + entry.getKey() + ", Square of the Number: " + entry.getValue());
        }
    }

}
