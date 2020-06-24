package com.myJ7NewFeatures.demo;

import java.sql.*;

public class TryWithResources {


    public static void main(String[] args) {

        String url = null;
        String user= null;
        String password= null;

        String query = "SELECT * FROM TABLES";
        try (Connection conn =  DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)){

            // do the stuff

        } catch (SQLException | NullPointerException excp){
            // print stacktrace
        }
    }
}
