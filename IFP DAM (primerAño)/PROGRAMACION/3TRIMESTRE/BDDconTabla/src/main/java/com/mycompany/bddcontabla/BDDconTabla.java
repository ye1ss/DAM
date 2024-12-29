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
public class BDDconTabla {

    public static void main(String[] args) {
        
        Connection ConectarBDD= null;
        try{
            //Establecemos conexion con la base de datos
            ConectarBDD= DriverManager.getConnection("jdbc:mysql://localhost:3307/test","root","");
            //Creamos un Statement, para realizar la query o consulta(query y consulta es lo mismo)
            Statement sentencia= ConectarBDD.createStatement();
            
            //Creamos una tabla llamada amigos (ponemos el IF NOT EXIST para que si esa tabla ya esta no se cree otra vez porque me dara error)
            sentencia.executeUpdate("CREATE TABLE IF NOT EXISTS amigos(id INT AUTO_INCREMENT, PRIMARY KEY(id), nombre VARCHAR(20),"
                    + " ciudad VARCHAR(20), telefono VARCHAR(10))");
            
//            //Creamos 3 arrays con los que vamos a meter en las tablas (ESTO LO TENIA EN UN PRINCIPIO, AHORA HACER UN ARRAY)
//            String nombres[]={"Eli", "Mar", "Jon", "Jose"};
//            String ciudades[]={"Madrid", "Sevilla", "Barcelona", "Alcobendas"};
//            String telefonos[]={"693662094", "622749911", "601002332", "669103054"};
            
            //3 Array para los datos
            String[] nombres= new String[4];
            nombres[0]= "Eli";
            nombres[1]= "Mar";
            nombres[2]= "Jon";
            nombres[3]= "Jose";
            
            String[] ciudades= new String[4];
            ciudades[0]="Madrid";
            ciudades[1]="Sevilla";
            ciudades[2]="Barcelona";
            ciudades[3]="Alcobendas";
            
            String[] telefonos= new String[4];
            telefonos[0]="693662094";
            telefonos[1]="622749911";
            telefonos[2]="601002332";
            telefonos[3]="669103054";
            
            
            //Se insertan los datos en la tabla
            for(int i=0; i< nombres.length; i++){
                sentencia.executeUpdate("INSERT INTO amigos(nombre, ciudad, telefono)"
                +"VALUES ('"+ nombres[i] +"','"+ ciudades[i] +"','"+ telefonos[i] +"')");
            }
            //Counsutamos la tabla amigos
            ResultSet rs= sentencia.executeQuery("select * from amigos");
            
            //Recorremos el ResultSet, mostrando por pantalla los resultados
            System.out.println("Los datos almacenados en la tabla amigos son: ");
            while(rs.next()){
                System.out.println(rs.getInt(1)+" "+ rs.getString(2)+" "+
                        rs.getString(3)+" "+ rs.getString(4));
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }finally { //Se cierra la conexion con la base de datos
            }
    }
}