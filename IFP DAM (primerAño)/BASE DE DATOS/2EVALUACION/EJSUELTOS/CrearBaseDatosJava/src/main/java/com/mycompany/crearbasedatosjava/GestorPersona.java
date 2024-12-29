/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crearbasedatosjava;

import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Alumno
 */
public class GestorPersona {
    Conexion c1= new Conexion();
    
    public void probar(){
        c1.conectar();
    }
    public void altaPersona(Persona p){
        try {
            Statement consulta = c1.conectar().createStatement();
            String query="insert into persona(name, lastname, phone, created_at)value('" + p.getNombre()+"','"+ p.getApellido()+"','"+ p.getTelefono()+"',now())";
            consulta.executeUpdate(query);
        }catch(SQLException ex){
            System.out.print("Se ha producido un error al insertar");
        }
    }
        //insert into persona(name, lastname, phone, created_at)value('"p.getName()+"','"+p.getLastname()+"','"+p.get.phone()+"','now()')";
        //insert into persona(name, lastname, phone, created_at)value("Fran", "Perez", "983294", "2023/01/25")
}
