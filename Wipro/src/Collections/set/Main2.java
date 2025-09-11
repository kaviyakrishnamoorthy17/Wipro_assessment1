package Collections.set;

import java.util.HashSet;

class MyCountry {
    // Instance variable
    private HashSet<String> H1 = new HashSet<>();

    // Method to add country name to HashSet
    public HashSet<String> saveCountryNames(String countryName) {
        H1.add(countryName);  // add country
        return H1;            // return updated HashSet
    }

    // Method to get country if exists, else return null
    public String getCountry(String countryName) {
        for (String country : H1) {
            if (country.equalsIgnoreCase(countryName)) { // case-insensitive check
                return country;
            }
        }
        return null; // not found
    }
}

public class Main2 {
    public static void main(String[] args) {
        MyCountry country = new MyCountry();

        // Adding countries
        country.saveCountryNames("India");
        country.saveCountryNames("USA");
        country.saveCountryNames("Japan");

        // Testing getCountry method
        System.out.println("Searching for India: " + country.getCountry("India"));
        System.out.println("Searching for USA: " + country.getCountry("USA"));
        System.out.println("Searching for Germany: " + country.getCountry("Germany")); // not in set
    }
}
