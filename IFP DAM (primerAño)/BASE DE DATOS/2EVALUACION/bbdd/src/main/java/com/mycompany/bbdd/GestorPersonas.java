/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bbdd;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alumno
 */
public class GestorPersonas {
    
    ArrayList<Persona> listaPersonas = new ArrayList();
    Conectar c1 = new Conectar();
    
    public void insertar(Persona p){
        try {
            // insertar un registro
            Statement consulta = c1.conectar().createStatement();
                                    //en vez de persona videojuego
            String query1 = "insert into persona (name,lastname,phone,created_at) value ('" + p.getName() + "', '" + p.getLastname() + "', '" + p.getPhone() + "', now())";
            consulta.executeUpdate(query1);
        } catch (SQLException ex) {
            System.out.println("No se ha podido insertar");
        }
        
        


    
    
    }
    
    
}
