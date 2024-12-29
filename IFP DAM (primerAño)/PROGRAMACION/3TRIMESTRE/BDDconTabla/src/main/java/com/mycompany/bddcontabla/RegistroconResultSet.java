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

/**
 *
 * @author Alumno
 */
public class RegistroconResultSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

            Connection ConectarBDD= null;
            try{
                //Establecemos conexion con la base de datos
                ConectarBDD= DriverManager.getConnection("jdbc:mysql://localhost:3307/test","root","");
                
                Statement sentencia= ConectarBDD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
              
                //Counsutamos la tabla amigos
                ResultSet rs= sentencia.executeQuery("select * from amigos");

                //Recorremos el ResultSet, mostrando por pantalla los resultados
                System.out.println("Los datos almacenados en la tabla amigos son: ");
                rs.afterLast();
                while(rs.previous()){
                    System.out.println(rs.getInt(1)+" "+ rs.getString(2)+" "+
                            rs.getString(3)+" "+ rs.getString(4));
                }
                //Aqui le quiero cambiar el nombre a la persona que este en la segunda posicion
                rs.absolute(2);
                //Aqui vuelvo a decir su posicion y cambio el nombre que habia por elena
                rs.updateString(2,"Elena");
                //Con esto hago que se actualize en la base de datos
                rs.updateRow();
                while(rs.next()){
                    System.out.println(rs.getInt(1) +" "+rs.getString(2)+" "+ rs.getString(3));
                }
               
                
            }catch(SQLException e){
                System.out.println(e.getMessage());
            }finally { //Se cierra la conexion con la base de datos
                }
        }
    
}
