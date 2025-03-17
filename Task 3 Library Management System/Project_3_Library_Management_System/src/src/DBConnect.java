package src;

import java.sql.*;


/**
 *
 * @author SJ
 */
public class DBConnect {
   private static final String URL = "jdbc:mysql://localhost:3306/library";
   private static final String USER = "root";
   private static final String PASSWORD = "Shaf333jak@";
   
    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connection established successfully.");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error establishing connection: " + e.getMessage());
        }
        return connection;
    }
}
