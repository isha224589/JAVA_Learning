package com.example;

import java.sql.*;

public class Conn {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:postgresql://localhost:5432/practice";
        String uname = "postgres";
        String pass = "1234";
        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);
        System.out.println("Connected to database");
    }
}