/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reservaapartamento;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Jorge Wang Wang
 */
public class Conectar {
String url = "jdbc:mysql://localhost:3307/apartamentos";
String user = "root";
String pass = "";
Connection connection = null;
public Connection conectar() throws SQLException{
    connection = DriverManager.getConnection(url, user,pass);//hacemos la conexion
return connection;
}
}
