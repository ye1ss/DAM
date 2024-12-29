/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.repasobdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Reservas {

    public static ArrayList <CrearReserva> reservas= new ArrayList();
    
    public static void main(String[] args) {
        //Nos conectamos a la base de datos si poner el nombre porque no esta creada
        String url = "jdbc:mysql://localhost:3306"; //si la base de datos ya estuviese creada se pone jdbc:mysql://localhost:3306/NombredelaBasedeDatos
        String user = "root";
        String pass = "";
        
        //Recuerda el pom
        Connection connection=  null;
        
        try{
            connection= DriverManager.getConnection(url, user, pass);
            Statement st= connection.createStatement();
            st.executeUpdate("CREATE DATABASE IF NOT EXISTS Deporte");
            st.executeUpdate("USE Deporte");
        }catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        Scanner sc= new Scanner(System.in);
        ResultSet rs;
        ResultSet rs2;
        Statement stmt;
        boolean salir= false;
        
        try{
            Statement st = connection.createStatement();
            st.executeUpdate("CREATE TABLE IF NOT EXISTS espacios("
                    + "Id INT PRIMARY KEY AUTO_INCREMENT,"
                    + "nombre VARCHAR(20),"    
                    + "deporte VARCHAR(20),"
                    + "capacidad VARCHAR(15)"
                    + ")");
            
            st.executeUpdate("CREATE TABLE IF NOT EXISTS reservas("
                    + "Id INT,"
                    + "nombre VARCHAR(20),"
                    + "apellido VARCHAR(20),"
                    + "nPersonas INT,"
                    + "diaReserva INT"
                    +")");
            
            while(salir==false){
            System.out.println("Seleccione una opción: ");
            System.out.println("1. Dar de alta a un espacio deportivo");
            System.out.println("2. Consultar los espacios deportivos");
            System.out.println("3. Crear una reserva");
            System.out.println("4. Consultar las reservas disponibles");
            System.out.println("5. Modificar una alta");
            System.out.println("6. Eliminar una reserva");
            System.out.println("7. Salir");
            
            Scanner scMenu = new Scanner(System.in);
            int opcionMenu= scMenu.nextInt();
           
            switch (opcionMenu){
                case 1:
                    DarAltaEspacio(url, user, pass);
                    break;
               
                case 2:
                     ConsultarEspacios(connection);
                    break;
                    
                case 3:
                    //Lo dejo asi y no lo meto en un metodo por si acaso
                    Connection conectarR= DriverManager.getConnection(url, user, pass);
                    Statement stReserva = conectarR.createStatement();
                    stReserva.executeUpdate("USE Deporte"); // Seleccionar la base de datos "Deporte"
                    //Pedimos datos
                    Scanner scE= new Scanner(System.in);
                    System.out.println("Introduce los datos para crear una reserva");
                    System.out.println("Id: ");
                    int Id= scE.nextInt();
                    System.out.println("Nombre: ");
                    String nombre= scE.next();
                    System.out.println("Apellido: ");
                    String apellido= scE.next();
                    System.out.println("Numero personas: ");
                    int nPersonas= scE.nextInt();
                    System.out.println("Dia reserva: ");
                    int diaReserva= scE.nextInt();
                    
                    CrearReserva reserva = new CrearReserva(Id, nombre, apellido, nPersonas, diaReserva);
                    reservas.add(reserva);
                    
                    //Lo insertamos en la tabla
                    String tablaEspacios= "INSERT INTO reservas(Id, nombre, apellido, nPersonas, diaReserva) VALUES (?, ?, ?, ?, ?)";
                    PreparedStatement pS= conectarR.prepareStatement(tablaEspacios);
                    pS.setInt(1, Id);
                    pS.setString(2, nombre);
                    pS.setString(3, apellido);
                    pS.setInt(4, nPersonas);
                    pS.setInt(5, diaReserva);
                    pS.executeUpdate();
                    
                    System.out.println("Reserva creada y almacenada con éxito.");
                    break;
                    
                    
                case 4:
                    //Voy a meter las reservas en un array para luego mostrar las reservas que estan en el array
                        System.out.println("Reservas disponibles:");
                        if (reservas.isEmpty()) {
                            System.out.println("No hay reservas almacenadas.");
                        } else {
                            for (CrearReserva re : reservas) {
                                System.out.println(re.toString());
                            }
                        }
                    
                    break;
                    
                case 5:
                    //Con esto podemos modificar las altas
                    Scanner scR= new Scanner(System.in);
                        System.out.println("Ingrese el ID del espacio deportivo que desea modificar: ");
                        int idModificarEspacio = scR.nextInt();

                        // Verificar si el espacio deportivo existe en la base de datos
                        Statement stmtModificar = connection.createStatement();
                        ResultSet rsModificar = stmtModificar.executeQuery("SELECT * FROM espacios WHERE Id = " + idModificarEspacio);

                        if (rsModificar.next()) {
                            // Mostrar los datos actuales del espacio deportivo
                            System.out.println("Datos actuales del espacio deportivo:");
                            System.out.println("ID: " + rsModificar.getInt("Id"));
                            System.out.println("Nombre: " + rsModificar.getString("nombre"));
                            System.out.println("Deporte: " + rsModificar.getString("deporte"));
                            System.out.println("Capacidad: " + rsModificar.getString("capacidad"));

                            // Pedir los nuevos datos para el espacio deportivo
                            System.out.println("Ingrese los nuevos datos para el espacio deportivo:");
                            System.out.println("Nombre: ");
                            String nuevoNombreEspacio = scR.next();
                            System.out.println("Deporte: ");
                            String nuevoDeporte = scR.next();
                            System.out.println("Capacidad: ");
                            String nuevaCapacidad = scR.next();

                            // Actualizar el espacio deportivo en la base de datos
                            PreparedStatement psModificarEspacio = connection.prepareStatement(
                                "UPDATE espacios SET nombre = ?, deporte = ?, capacidad = ? WHERE Id = ?"
                            );
                            psModificarEspacio.setString(1, nuevoNombreEspacio);
                            psModificarEspacio.setString(2, nuevoDeporte);
                            psModificarEspacio.setString(3, nuevaCapacidad);
                            psModificarEspacio.setInt(4, idModificarEspacio);
                            psModificarEspacio.executeUpdate();

                            System.out.println("El espacio deportivo ha sido modificado exitosamente.");
                        } else {
                            System.out.println("No se encontró ningún espacio deportivo con el ID especificado.");
                        }

                    break;


                case 6:
                    //Con esto elimino las reservas de la base de datos
                    Scanner scM= new Scanner(System.in);
                    System.out.println("Ingrese el ID de la reserva que desea eliminar: ");
                        int idEliminarReserva = scM.nextInt();

                        // Verificar si la reserva existe en la base de datos
                        Statement stmtEliminar = connection.createStatement();
                        ResultSet rsEliminar = stmtEliminar.executeQuery("SELECT * FROM reservas WHERE Id = " + idEliminarReserva);

                        if (rsEliminar.next()) {
                            // Mostrar los datos de la reserva a eliminar
                            System.out.println("Datos de la reserva a eliminar:");
                            System.out.println("ID: " + rsEliminar.getInt("Id"));
                            System.out.println("Nombre: " + rsEliminar.getString("nombre"));
                            System.out.println("Apellido: " + rsEliminar.getString("apellido"));
                            System.out.println("Número de personas: " + rsEliminar.getInt("nPersonas"));
                            System.out.println("Día de reserva: " + rsEliminar.getInt("diaReserva"));

                            // Confirmar la eliminación de la reserva
                            System.out.println("¿Está seguro de que desea eliminar esta reserva? (S/N)");
                            String confirmacion = scM.next();

                            if (confirmacion.equalsIgnoreCase("S")) {
                                // Eliminar la reserva de la base de datos
                                PreparedStatement psEliminarReserva = connection.prepareStatement(
                                    "DELETE FROM reservas WHERE Id = ?"
                                );
                                psEliminarReserva.setInt(1, idEliminarReserva);
                                psEliminarReserva.executeUpdate();

                                System.out.println("La reserva ha sido eliminada exitosamente.");
                            } else {
                                System.out.println("La eliminación de la reserva ha sido cancelada.");
                            }
                        } else {
                            System.out.println("No se encontró ninguna reserva con el ID especificado.");
                        }
                    break;

                    
                case 7:
                    salir= true;
                    break;
            }
        }    
            }catch (SQLException ex) {
                System.out.println(ex.getMessage());
        }
    }

    private static void ConsultarEspacios(Connection connection) throws SQLException {
        //Esta manera es recorriendo la base de datos
        Statement stt= connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        ResultSet resultSet= stt.executeQuery("SELECT * FROM espacios");
        resultSet.afterLast();
        while(resultSet.previous()){
            System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getString(3)+" "+resultSet.getString(4));
        }
    }

    private static void DarAltaEspacio(String url, String user, String pass) throws SQLException {
        Connection conectarE= DriverManager.getConnection(url, user, pass);
        Statement stEspacios = conectarE.createStatement();
        stEspacios.executeUpdate("USE Deporte"); // Seleccionar la base de datos "Deporte"
        //Pedimos los datos
        Scanner scc= new Scanner(System.in);
        System.out.println("Introduzca los datos para el espacio deportivo");
        System.out.println("Id: ");
        int Id= scc.nextInt();
        System.out.println("Nombre: ");
        String nombre= scc.next();
        System.out.println("Deporte: ");
        String deporte= scc.next();
        System.out.println("Capacidad: ");
        String capacidad= scc.next();
        
        //Lo insertamos en la tabla
        String tablaEspacios= "INSERT INTO espacios(Id, nombre, deporte, capacidad) VALUES (?, ?, ?, ?)";
        PreparedStatement ps= conectarE.prepareStatement(tablaEspacios);
        ps.setInt(1, Id);
        ps.setString(2, nombre);
        ps.setString(3, deporte);
        ps.setString(4, capacidad);
        ps.executeUpdate();
    }
}
