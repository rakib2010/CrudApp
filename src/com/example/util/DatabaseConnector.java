/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Instructor
 */
public class DatabaseConnector {
    private final static String USER = "root";
    private final static String PWD = "123456";
    private final static String URL = "jdbc:mysql://localhost:3306/";
    private final static String DATABASE_NAME = "pms47";
    private static Connection conn = null;
    
    // used singleton pattern.
    public static Connection connect() throws ClassNotFoundException, SQLException{
        
        if(conn == null){
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(URL+DATABASE_NAME, USER, PWD);
            return conn;
        }        
        return conn;
    }
    
}
