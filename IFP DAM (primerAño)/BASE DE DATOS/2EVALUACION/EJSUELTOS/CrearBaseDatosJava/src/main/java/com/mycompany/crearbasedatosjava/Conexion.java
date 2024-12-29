/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crearbasedatosjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Alumno
 */
public class Conexion {
        String url = "jdbc:mysql://localhost:3307/myjavaapp1";
    String user = "root";
    String pass = "";
    Connection connection=null;
    public Connection conectar(){
        try {
            connection = DriverManager.getConnection(url,user,pass);  
            System.out.println("Se ha conectado correctamente");
            } catch (SQLException ex) {
            System.out.println("Se ha producido un error en la conexion");            
        }
   return connection;
    }
}
