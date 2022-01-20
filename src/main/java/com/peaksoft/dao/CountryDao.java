package com.peaksoft.dao;

import com.peaksoft.entity.City;
import com.peaksoft.entity.Country;

import java.util.List;

public interface CountryDao {
    void addCountry(String name, int leader_id);
    void printCountries();
    List<Country> getAllCountries();
}
