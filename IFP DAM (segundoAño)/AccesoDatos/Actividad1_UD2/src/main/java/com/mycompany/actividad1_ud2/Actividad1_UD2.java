/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividad1_ud2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Alumno
 */
public class Actividad1_UD2 {

    public static void main(String[] args) {
        Connection conn = null;

        try {
            String url = "jdbc:mysql://localhost:3306/sakila";
            String user = "root";
            String password = "";
            conn = DriverManager.getConnection(url, user, password);
            if (conn != null) {
                System.out.println("Conectando MYSQL");
                Statement s = conn.createStatement();
                Statement s1 = conn.createStatement();
                ResultSet rs = s.executeQuery("select * FROM city");
                ResultSet rs1 = s1.executeQuery("select * FROM country");
                while (rs.next()) {
                    System.out.println("Paises: " + rs.getString("city"));
                }
                while (rs1.next()) {
                    System.out.println("Ciudades: " + rs1.getString("country"));
                }
            }
        } catch (SQLException ex) {
            System.out.println("ERROR:La dirección no es válida o el usuario y clave");
            ex.printStackTrace();

        }
    }
}

