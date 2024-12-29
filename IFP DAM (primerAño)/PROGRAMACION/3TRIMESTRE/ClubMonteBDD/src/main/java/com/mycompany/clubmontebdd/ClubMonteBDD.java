/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.clubmontebdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class ClubMonteBDD {

    public static void main(String[] args) {
                Connection ConectarBDD= null;
        try{
            //Establecemos conexion con la base de datos
            ConectarBDD= DriverManager.getConnection("jdbc:mysql://localhost:3307/test","root","");
            //Creamos un Statement, para realizar la query o consulta(query y consulta es lo mismo)
            java.sql.Statement sentencia= ConectarBDD.createStatement();
            
            //Creamos una tabla llamada amigos (ponemos el IF NOT EXIST para que si esa tabla ya esta no se cree otra vez porque me dara error)
            sentencia.executeUpdate("CREATE TABLE IF NOT EXISTS socios(id INT AUTO_INCREMENT, PRIMARY KEY(id), nombre VARCHAR(20),"
                    + " apellido VARCHAR(20), actividad VARCHAR(15))");
            
            boolean salir = false;
            while (!salir) { // Menú principal
                System.out.println("Seleccione una opción:");
                System.out.println("1. Alta de socio");
                System.out.println("2. Mostrar socios");
                System.out.println("3. Modificar la actividad de un socio");
                System.out.println("4. Salir");
                
            Scanner sc= new Scanner(System.in);    
            int opcion = sc.nextInt();
            
             switch (opcion) {
                    case 1: // Alta de socio
                        System.out.println("Introduzca los datos del socio:");
                        System.out.print("Nombre: ");
                        String nombre = sc.next();
                        System.out.print("Apellido: ");
                        String apellido = sc.next();
                        System.out.print("Actividad: ");
                        String actividad = sc.next();
                        
                        insertar= sc.nextInt();
                        switch (insertar){
                            case 0->{
                            insertar= 0;
                                System.out.println("Socio añadido con exito!");
                                consulta.executeUpdate ("INSERT INTO socios (nombre, apellido, actividad)" + " VALUES ("+ nombre + "," + apellido +"," actividad)); // Inserción del socio en la tabla
                            }
                        }
                            
                        
                        
                        PreparedStatement pstmt = ConectarBDD.prepareStatement(insertSocio);
                        pstmt.setString(1, nombre);
                        pstmt.setString(2, apellido);
                        pstmt.setString(3, actividad);
                        pstmt.executeUpdate();
                        break;
                        
                    case 2: //Mostrar socios
                        ResultSet rs= consulta.executeQuery("select * from socios");
                        System.out.println("Los datos almacenados en la tabla socios son: ");
                        while(rs.next()){
                            System.out.println("");
                        }
                        break;
                    
                    case 3:
                        
                    case 4: //Salir
                         salir = true;
                        break;
                    
                }
             }
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("Error al cargar la base de datos");
        }finally { //Se cierra la conexion con la base de datos
            }
    }
}
