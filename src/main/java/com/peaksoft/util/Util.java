package com.peaksoft.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String url = "jdbc:postgresql://localhost:5432/test";
    private static final String user = "postgres";
    private static final String password = "Shabotoev92@";

    public static Connection connection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, user, password);
//            System.out.println("Connected to the PostgreSQL server\n" +
//                    "successfully.");
        } catch (SQLException e) {
            e.getMessage();
        }
        return connection;
    }
}
