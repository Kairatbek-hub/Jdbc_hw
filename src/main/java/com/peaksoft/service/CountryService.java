package com.peaksoft.service;

import com.peaksoft.entity.Country;

import java.util.List;

public interface CountryService {
    void addCountry(String name, int leader_id);
    void printCountries();
    List<Country> getAllCountries();
}
