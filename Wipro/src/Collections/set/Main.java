package Collections.set;

import java.util.HashSet;

class Country {
    // Instance variable
    private HashSet<String> H1 = new HashSet<>();

    // Method to add country name to HashSet
    public HashSet<String> saveCountryNames(String countryName) {
        H1.add(countryName);  // add country
        return H1;            // return updated HashSet
    }
}

public class Main {
    public static void main(String[] args) {
        Country country = new Country();

        // Adding countries
        System.out.println("After adding India: " + country.saveCountryNames("India"));
        System.out.println("After adding USA: " + country.saveCountryNames("USA"));
        System.out.println("After adding Japan: " + country.saveCountryNames("Japan"));
        System.out.println("After adding India again: " + country.saveCountryNames("India")); // duplicate ignored
    }
}
