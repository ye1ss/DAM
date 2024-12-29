/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clubmontebd;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Alumno
 */
public class GestorSocios {
        ArrayList<Socios> listaSocios = new ArrayList();
        Conectar c1 = new Conectar();
    
    public void insertar(Socios s){
        try {
            // insertar un registro
            Statement consulta = c1.conectar().createStatement();
                                    
            String query1 = "insert into socio (name,lastname,actividad) value ('" + s.getName() + "', '" + s.getLastname() + "', '" + s.getActividad() +"" ;
            System.out.println(query1);
            consulta.executeUpdate(query1);
        } catch (SQLException ex) {
            System.out.println("No se ha podido insertar");
        }
    }
}