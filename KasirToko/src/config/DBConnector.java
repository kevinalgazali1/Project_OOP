package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class DBConnector {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/db_shop";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "";
    
    protected static Connection connect;
    protected static PreparedStatement statement;
    protected static ResultSet resultSet;
    protected static Statement stmt;

    public static void getConnection() {
        try {
            connect = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}