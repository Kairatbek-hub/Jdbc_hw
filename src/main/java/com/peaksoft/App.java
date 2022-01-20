package com.peaksoft;

import com.peaksoft.entity.City;
import com.peaksoft.entity.Country;
import com.peaksoft.service.*;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main( String[] args ) {
        LeaderService leaderService = new LeaderServiceImpl();
//        leaderService.addLeader("Sadyr Japarov", 53, "president");
//        leaderService.addLeader("Vladimir Putin", 68, "president");
//        leaderService.addLeader("Kasym-Jomart Tokaev", 67, "president");
//        leaderService.addLeader("Shavkat Mirziyoyev", 63, "president");
//        leaderService.addLeader("Gurbanguly Berdimuhamedov", 63, "president");
//
//        leaderService.addLeader("Aibek Zhunushaliev", 45, "mer");
//        leaderService.addLeader("Sergey Sobyanin", 62, "mer");
//        leaderService.addLeader("Altai Kulginov", 42, "mer");
//        leaderService.addLeader("Dzhohongir Abdyhodzhaev", 46, "mer");
//        leaderService.addLeader("Shamuhammet Durdylyev", 57, "mer");

        leaderService.printLeaders();
        System.out.println("------------------------------------------------");

        CountryService countryService = new CountryServiceImpl();
//        countryService.addCountry("Kyrgyzstan", 1);
//        countryService.addCountry("Rassia", 2);
//        countryService.addCountry("Kazakhstan", 3);
//        countryService.addCountry("Uzbekstan", 4);
//        countryService.addCountry("Turkmenstan", 5);

        countryService.printCountries();
        System.out.println("--------------------------------------------------");
//        List<Country> listOfCountries;
//        listOfCountries = countryService.getAllCountries();
//        for (Country country:listOfCountries) {
//            System.out.println(country);
//        }
        System.out.println("-------------------------------------------------");

        CityService cityService = new CityServiceImpl();
//        cityService.addCity("Bishkek",6,1);
//        cityService.addCity("Moscow",7,2);
//        cityService.addCity("Astana",8,3);
//        cityService.addCity("Tashkent",9,4);
//        cityService.addCity("Ashhabad",10,5);

        cityService.printCities();
        System.out.println("---------------------------------------------------");
//        List<City> listOfCities;
//        listOfCities = cityService.getAllCities();
//        for (City city:listOfCities) {
//            System.out.println(city);
//        }
        System.out.println();
        cityService.getCityById(1);
    }
}
