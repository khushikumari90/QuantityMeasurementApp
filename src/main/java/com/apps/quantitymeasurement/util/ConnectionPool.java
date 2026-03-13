package com.apps.quantitymeasurement.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionPool {

    private static ConnectionPool instance;

    private ConnectionPool() {}

    public static ConnectionPool getInstance() {

        if (instance == null)
            instance = new ConnectionPool();

        return instance;
    }

    public Connection getConnection() throws SQLException {

        String url = ApplicationConfig.getProperty("db.url");
        String user = ApplicationConfig.getProperty("db.user");
        String password = ApplicationConfig.getProperty("db.password");

        return DriverManager.getConnection(url, user, password);
    }
}