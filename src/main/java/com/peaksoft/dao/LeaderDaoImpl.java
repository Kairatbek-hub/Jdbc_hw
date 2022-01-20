package com.peaksoft.dao;

import com.peaksoft.util.Util;

import java.sql.*;

public class LeaderDaoImpl implements LeaderDao {
    @Override
    public void addLeader(String name, int age, String position) {
        String SQL = "INSERT INTO leaders(name, age, position)" +
                "VALUES(?, ?, ?)";
        try(Connection con = Util.connection();
            PreparedStatement statement = con.prepareStatement(SQL)) {
            statement.setString(1, name);
            statement.setInt(2, age);
            statement.setString(3, position);
            statement.executeUpdate();
        } catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void printLeaders() {
        String SQL = "SELECT * FROM leaders";
        try(Connection con = Util.connection();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(SQL)) {
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " | "
                        + rs.getString("name") + " | "
                        + rs.getInt("age") + " | "
                        + rs.getString("position"));
            }
        } catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
    }
}
