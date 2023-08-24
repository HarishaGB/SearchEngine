package com.Accio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {
    static Connection connection = null;
    public static Connection getConnection() { //this get connection method is not same of line no 14 & 16
        if (connection != null) {
            return connection;
        }
        String user = "root";
        String pwd = "12345";
        String db = "searchengineapp";
        return getConnection(user, pwd, db);
    }
    private  static Connection getConnection(String user, String pwd, String db){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/" + db + "?user=" + user + "&password=" + pwd);
        }
        catch(SQLException | ClassNotFoundException sqlException){
            sqlException.printStackTrace();
        }
        return connection;

    }

}

