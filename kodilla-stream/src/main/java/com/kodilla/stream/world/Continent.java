package com.kodilla.stream.world;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public final class Continent {
    final private String continentName;
    final private List<Country> countriesList = new ArrayList<>();


    public Continent(final String continentName){
        this.continentName = continentName;

    }

    public String getContinentName() {
        return continentName;
    }

    public List<Country> getCountriesList() {
        return countriesList;
    }

    public void addCountry(Country country){
        countriesList.add(country);
    }




}
