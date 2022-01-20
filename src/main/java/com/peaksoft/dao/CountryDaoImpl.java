package com.peaksoft.dao;

import com.peaksoft.entity.Country;
import com.peaksoft.util.Util;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CountryDaoImpl implements CountryDao {
    @Override
    public void addCountry(String name, int leader_id) {
        String SQL = "INSERT INTO countries(name, leader_id) VALUES(?, ?)";
        try(Connection con = Util.connection();
            PreparedStatement statement = con.prepareStatement(SQL)) {
            statement.setString(1, name);
            statement.setInt(2, leader_id);
            statement.executeUpdate();
        } catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void printCountries() {
        String SQL = "SELECT * FROM countries";
        try(Connection con = Util.connection();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(SQL)) {
            while (rs.next()){
                System.out.println(rs.getInt("id") + " | "
                        + rs.getString("name") + " | "
                        + rs.getInt("leader_id"));
            }
        } catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public List<Country> getAllCountries() {
        List<Country> countriesList = new ArrayList<>();
        String SQL = "SELECT * FROM countries";
        try(Connection con = Util.connection();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(SQL)) {
            while (rs.next()){
                Country country = new Country(rs.getInt("id"),
                        rs.getString("name"),
                        rs.getInt("leader_id"));
                countriesList.add(country);

            }
            return countriesList;
        } catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }
}
