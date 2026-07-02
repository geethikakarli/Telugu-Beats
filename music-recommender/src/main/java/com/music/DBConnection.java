package com.music;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    // Database configuration
    private static final String URL = "jdbc:mysql://localhost:3306/music_db";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "password";

    /**
     * Establishes a database connection.
     * This is prepared for future optional MySQL integration.
     *
     * @return Connection object
     * @throws SQLException If database access error occurs
     */
    public static Connection getConnection() throws SQLException {
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (ClassNotFoundException e) {
            System.err.println("MySQL Driver not found. Ensure the dependency is added.");
            e.printStackTrace();
            throw new SQLException("Database driver missing.", e);
        }
    }
}
