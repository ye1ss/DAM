/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conectarBaseDatos1;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author yeism
 */
public class conectBdd1 {
    /*
    <dependencies>
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.33</version>
        </dependency>
    </dependencies>
    */
    public static void main(String[] args) {
        String ruta= "jdbc:mysql://localhost:3307/sakila";
        String nombre= "root";
        String contraseña= "root";//la de mi casa es root
        
        Connection conexion= null;
        Statement statement= null;
        ResultSet resultSet= null;
        
        try{
            conexion= DriverManager.getConnection(ruta, nombre, contraseña);
            
        }catch(SQLException e)
            e.printStackTrace();
        }
        
    }
}
