package com.peaksoft.dao;

import com.peaksoft.entity.City;
import com.peaksoft.util.Util;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CityDaoImpl implements CityDao {
    @Override
    public void addCity(String name, int leader_id, int country_id) {
            String SQL = "INSERT INTO cities(name, leader_id, country_id) VALUES(?, ?, ?)";
            try(Connection con = Util.connection();
                PreparedStatement statement = con.prepareStatement(SQL)) {
                statement.setString(1, name);
                statement.setInt(2, leader_id);
                statement.setInt(3, country_id);
                statement.executeUpdate();
            } catch (SQLException ex){
                System.out.println(ex.getMessage());
            }
    }

    @Override
    public void printCities() {
     //   String SQL = "SELECT * FROM cities";
        String SQL = "SELECT cities.id, cities.name, leaders.name as leaderName, leaders.position, countries.name as countryName FROM cities " +
                "join leaders on leaders.id = cities.leader_id " +
                "join countries on countries.id = cities.country_id ";
        try(Connection con = Util.connection();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(SQL)) {

            while (rs.next()){
                System.out.println(rs.getInt("id") + " | "
                        + rs.getString("name") + " | "
                        + rs.getString("leaderName") + " | "
                        + rs.getString("position") + " | "
                        + rs.getString("countryName"));
            }

        } catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public List<City> getAllCities() {
        List<City> cityList = new ArrayList<>();
        String SQL = "SELECT * FROM cities";
        try(Connection con = Util.connection();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(SQL)) {
            while (rs.next()){
                City city = new City(rs.getInt("id"),
                        rs.getString("name"),
                        rs.getInt("leader_id"),
                        rs.getInt("country_id"));
                cityList.add(city);
            }
            return cityList;
        } catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }

    @Override
    public void getCityById(int id) {
        String SQL = "SELECT cities.id, cities.name, leaders.name as leaderName, " +
                "leaders.position, countries.name as countryName FROM cities " +
                "join leaders on leaders.id = cities.leader_id " +
                "join countries on countries.id = cities.country_id " +
                " WHERE cities.id = ?";

        try(Connection con = Util.connection();
            PreparedStatement statement = con.prepareStatement(SQL)) {
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();
            while (rs.next()){
                System.out.println(rs.getInt("id") + " | "
                        + rs.getString("name") + " | "
                        + rs.getString("leaderName") + " | "
                        + rs.getString("position") + " | "
                        + rs.getString("countryName"));
            }
        } catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
    }
}

