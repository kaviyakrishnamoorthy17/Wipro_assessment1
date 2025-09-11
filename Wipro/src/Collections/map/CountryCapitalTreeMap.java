package Collections.map;

import java.util.*;

public class CountryCapitalTreeMap {
    TreeMap<String, String> M1 = new TreeMap<>();

    public TreeMap<String, String> saveCountryCapital(String countryName, String capital) {
        M1.put(countryName, capital);
        return M1;
    }

    public String getCapital(String countryName) {
        return M1.get(countryName);
    }

    public String getCountry(String capitalName) {
        for (Map.Entry<String, String> entry : M1.entrySet()) {
            if (entry.getValue().equals(capitalName)) {
                return entry.getKey();
            }
        }
        return null;
    }

    public TreeMap<String, String> reverseMap() {
        TreeMap<String, String> M2 = new TreeMap<>();
        for (Map.Entry<String, String> entry : M1.entrySet()) {
            M2.put(entry.getValue(), entry.getKey());
        }
        return M2;
    }

    public ArrayList<String> countryList() {
        return new ArrayList<>(M1.keySet());
    }

    public static void main(String[] args) {
        CountryCapitalTreeMap obj = new CountryCapitalTreeMap();
        obj.saveCountryCapital("India", "Delhi");
        obj.saveCountryCapital("Japan", "Tokyo");
        obj.saveCountryCapital("USA", "Washington");

        System.out.println("Capital of Japan: " + obj.getCapital("Japan"));
        System.out.println("Country with capital Tokyo: " + obj.getCountry("Tokyo"));
        System.out.println("Reversed Map (Capital -> Country): " + obj.reverseMap());
        System.out.println("Country List: " + obj.countryList());
    }
}
