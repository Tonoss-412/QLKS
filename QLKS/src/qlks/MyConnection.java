package qlks;

import java.sql.DriverManager;


public class MyConnection {
    public static java.sql.Connection getConnection() {
        java.sql.Connection conn = null;
        try {
            String url = "jdbc:mysql://localhost:3306/ql_khachsan";
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            String username = "root";
            String password = "123456";
            conn = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

    public static void closeConnection(java.sql.Connection c) {
        try {
            c.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
