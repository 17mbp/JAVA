/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject0;

import java.sql.*;

/**
 *
 * @author Manue
 */
public class dbConnection {

    static String url = "jdbc:mysql://localhost:3306/datos";
    static String user = "root";
    static String password = "";

    public static Connection getConnection() {
        try {      
          Connection con = DriverManager.getConnection(url, user, password);
System.out.println("CONECTADO MYSQL PAPA");
return con;
        } catch (Exception ex) {
System.err.println("ERROR EN LA " + ex.getMessage());return null;
        }
    }
}
