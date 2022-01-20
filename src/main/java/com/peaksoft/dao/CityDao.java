package com.peaksoft.dao;

import com.peaksoft.entity.City;

import java.util.List;

public interface CityDao {
    void addCity(String name, int leader_id, int country_id);
    void printCities();
    List<City> getAllCities();
    void getCityById(int id);

}
