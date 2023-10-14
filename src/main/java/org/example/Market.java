package org.example;

import java.util.List;

public class Market {
    private static final int MIN_COUNTRIES = 3;
    private String name;
    private List<Country> countryList;


    public Market(String name, List<Country> countryList) {
        if (!validateCountryList(countryList)) {
            throw new IllegalArgumentException("Provided country list is less than " + MIN_COUNTRIES);
        }
        this.name = name;
        this.countryList = countryList;
    }

    public String getName() {
        return name;
    }

    public List<Country> getCountries() {
        return countryList;
    }

    @Override
    public String toString() {
        return "Market:" + name + ", countries " + countryList;
    }

    private boolean validateCountryList(List<Country> countryList) {
        return countryList.size() >= MIN_COUNTRIES;
    }
}
