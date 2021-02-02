/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utility;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.SQLException;

/**
 *
 * @author N.Adrien
 */
public class ConnectDB {
    static Connection connection=null;
    public static Connection  connection() throws  SQLException{
     connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/phpmyadmin", "root", "");
     return connection;
    }
}
