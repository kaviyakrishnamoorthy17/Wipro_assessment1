package Collections.map;

import java.util.*;

public class CountryCapitalMap {
    HashMap<String, String> M1 = new HashMap<>();

    // 1. Save country and capital
    public HashMap<String, String> saveCountryCapital(String countryName, String capital) {
        M1.put(countryName, capital);
        return M1;
    }

    // 2. Get capital by country name
    public String getCapital(String countryName) {
        return M1.get(countryName);
    }

    // 3. Get country by capital name
    public String getCountry(String capitalName) {
        for (Map.Entry<String, String> entry : M1.entrySet()) {
            if (entry.getValue().equals(capitalName)) {
                return entry.getKey();
            }
        }
        return null;
    }

    // 4. Create reverse map
    public HashMap<String, String> reverseMap() {
        HashMap<String, String> M2 = new HashMap<>();
        for (Map.Entry<String, String> entry : M1.entrySet()) {
            M2.put(entry.getValue(), entry.getKey());
        }
        return M2;
    }

    // 5. Create ArrayList of country names
    public ArrayList<String> countryList() {
        return new ArrayList<>(M1.keySet());
    }

    public static void main(String[] args) {
        CountryCapitalMap obj = new CountryCapitalMap();
        obj.saveCountryCapital("India", "Delhi");
        obj.saveCountryCapital("Japan", "Tokyo");

        System.out.println("Capital of India: " + obj.getCapital("India"));
        System.out.println("Country with capital Tokyo: " + obj.getCountry("Tokyo"));
        System.out.println("Reversed Map (Capital -> Country): " + obj.reverseMap());
        System.out.println("Country List: " + obj.countryList());
    }
}
