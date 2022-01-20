package com.peaksoft.service;

import com.peaksoft.dao.CityDao;
import com.peaksoft.dao.CityDaoImpl;
import com.peaksoft.entity.City;

import java.util.List;

public class CityServiceImpl implements CityService {
    CityDao cityDao = new CityDaoImpl();
    @Override
    public void addCity(String name, int leader_id, int country_id) {
        cityDao.addCity(name, leader_id, country_id);
    }

    @Override
    public void printCities() {
        cityDao.printCities();
    }

    @Override
    public List<City> getAllCities() {
        return cityDao.getAllCities();
    }

    @Override
    public void getCityById(int id) {
        cityDao.getCityById(id);
    }
}
