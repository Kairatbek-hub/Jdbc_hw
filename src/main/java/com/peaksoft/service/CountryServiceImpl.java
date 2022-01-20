package com.peaksoft.service;

import com.peaksoft.dao.CountryDao;
import com.peaksoft.dao.CountryDaoImpl;
import com.peaksoft.entity.Country;

import java.util.List;

public class CountryServiceImpl implements CountryService {
    CountryDao countryDao = new CountryDaoImpl();
    @Override
    public void addCountry(String name, int leader_id) {
        countryDao.addCountry(name, leader_id);
    }

    @Override
    public void printCountries() {
        countryDao.printCountries();
    }

    @Override
    public List<Country> getAllCountries() {
        return countryDao.getAllCountries();
    }
}
