package logistic;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    static final String URL = "jdbc:mysql://localhost:3306/library_db";
    static final String USER = "root";
    static final String PASSWORD = "Tarun.8650$";

    public static Connection getConnection() throws Exception {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
