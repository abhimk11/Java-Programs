package Try;

import java.util.ArrayList;
import java.util.List;

public class Cities {

    public static void checkCity(List<String> cities,String targetCity){

        boolean s = false;
        for (String i : cities){
            if (i.equals(targetCity)){
                System.out.println("Found it!!! : "+ i);
                s=true;
                break;
            }
        }
        if (!s){
            System.out.println("Not Found!!!");
        }
    }

    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Bangalore");

        checkCity(cities,"Delhi");
    }
}
