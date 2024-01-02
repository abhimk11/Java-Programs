package javaInternet;

import java.util.HashMap;

public class MapLnD {

    private HashMap<String,String> map;

    public MapLnD(){
        map= new HashMap<>();
    }

    public HashMap<String,String> saveCountryCapital(String country,String capital){
        map.put(country,capital);
        return map;
    }

    public String getCapital(String country){
        return map.getOrDefault(country,"");
    }

    public String getCountry(String capital){
        for (HashMap.Entry<String,String > entry:map.entrySet()){
            if (entry.getValue().equals(capital)){
                return entry.getKey();
            }
        }
        return "";
    }
    public static void main(String[] args) {
        MapLnD m = new MapLnD();
        m.saveCountryCapital("US","Wash DC");
        System.out.println(m.getCapital("US"));
        System.out.println(m.getCountry("Wash DC"));
    }
}
