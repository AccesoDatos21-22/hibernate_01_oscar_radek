package utils;

import java.sql.*;

public class Utilidades {
    private static String url = "jdbc:mariadb://localhost:3306/";

    private static Connection connection;

    public static Connection getConnection(String databaseName) throws SQLException {
        connection = DriverManager.getConnection(url+databaseName+"?user=root&password=root");
        if(connection == null) throw new NullPointerException("La conexion es nula");
        return connection;
    }
    public void closeConnection() throws SQLException {
        if (connection != null)
            connection.close();
        connection = null;
    }
}
