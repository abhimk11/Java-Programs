package xtra;

import java.util.HashMap;
import java.util.Map;

public class CountryMap {
    HashMap<String,String> m1 = new HashMap<>();
    public HashMap<String,String>  saveCountryCapital(String countryName, String capital){
        m1.put(countryName, capital);
        return m1;
    }

    public static void main(String[] args) {
        CountryMap countryMap = new CountryMap();
        countryMap.saveCountryCapital("US","WashingtonDC");
        System.out.println(countryMap.getCapital("US"));
        System.out.println(countryMap.getCountry("WashingtonDC"));


    }
    private String getCountry(String capital) {
        for (Map.Entry<String,String> entry:m1.entrySet()){
            if (entry.getValue().equals(capital)){
                return entry.getKey();
            }
        }
        return " ";
    }
    private String getCapital(String country) {
        if (m1.containsKey(country)){
            return m1.get(country);
        }
        else {
            return " ";
        }
    }
}
