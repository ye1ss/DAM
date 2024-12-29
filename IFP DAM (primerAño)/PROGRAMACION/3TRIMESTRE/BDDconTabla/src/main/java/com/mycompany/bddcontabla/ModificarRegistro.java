/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.bddcontabla;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class ModificarRegistro {

    /**
     * @param args the command line arguments
     */
    
    //ESTE PROGRAMA SIRVE PARA QUE EN LA BASE DE DATOS DE AMIGOS PODAMOS MODIFICAR DESDE AQUI EL TELEFONO
    
    public static void main(String[] args) {
        Connection ConectarBDD= null;
        int id;
        try{
        //Establecemos conexion con la base de datos
            ConectarBDD= DriverManager.getConnection("jdbc:mysql://localhost:3307/test","root","");
            System.out.println("Nombre del amigo:");
            Scanner scentrada= new Scanner(System.in);
            String nombre= scentrada.next();
            System.out.println("Su numero de telefono");
            String telefono= scentrada.next();
            //Se crea un statement, para realizar el query
            Statement sentencia= ConectarBDD.createStatement();
            
            //consultamos el id del primer contacto con el nombre introducido
            ResultSet rs= sentencia.executeQuery("SELECT id FROM amigos WHERE nombre='"+ nombre+"'");
            
            if(rs.next()){ //Si rs.next devielve true significa que almenos hay un registro
                id = rs.getInt("id"); // Se obtienen su id
                //Actualizamos el registro
                sentencia.executeUpdate("Update amigos SET telefono='"+telefono+"' WHERE id="+id);
            }
            else{
                System.out.println("Ese amigo no está en la tabla");
            }          
        }catch(SQLException e){
            System.out.println(e.getMessage());     
            
        }finally { //Se cierra la conexion a la base de datos
        try{
            if(ConectarBDD !=null){
                ConectarBDD.close();
            }
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
            }   
        }   
    }
}