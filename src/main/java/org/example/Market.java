package org.example;

import java.util.List;

public class Market {
    private static final int MIN_COUNTRIES = 3;
    String name;
    private List<Country> countryList;


    public Market(String name, List<Country> countryList) {
        this.name = name;
        this.countryList = countryList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Country> getCountries() {
        return countryList;
    }

    public void setCountries(List<Country> countryList) {
        this.countryList = countryList;
    }
    @Override
    public String toString() {
        return "Market:" + name + ", countries " + countryList;
    }

    private boolean validateCountryList() {
        return countryList.size() == MIN_COUNTRIES;
    }
}
