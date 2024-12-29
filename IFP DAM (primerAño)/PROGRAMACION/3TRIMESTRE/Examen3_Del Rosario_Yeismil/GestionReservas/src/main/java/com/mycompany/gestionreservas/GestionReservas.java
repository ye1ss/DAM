/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.gestionreservas;

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
 * @author yeismil
 */
public class GestionReservas {

    public static ArrayList<Reserva> ReservasAlta =new ArrayList();
    

    public static void main(String[] args) {
        //Nos conectamos a la base de datos
        
        String url = "jdbc:mysql://localhost:3306";
        String user = "root";
        String pass = "";
        
        //Recuerda el pom
        Connection reserva = null;
        
        try{
        reserva = DriverManager.getConnection(url, user, pass);
        Statement st = reserva.createStatement();
            st.executeUpdate("CREATE DATABASE IF NOT EXISTS apartamentos");
            st.executeUpdate("USE apartamentos");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        Scanner sc = new Scanner(System.in);
        ResultSet rs;
        ResultSet rs2;
        Statement stmt;
        boolean salir = false;


        //Creamos la tabla y lo que va a contener
        try {
        Statement st = reserva.createStatement();    
            st.executeUpdate("CREATE TABLE IF NOT EXISTS reservas("
                    + "Nreserva INT(100),"
                    + "Napartamento INT(100),"
                    + "nombre VARCHAR(20),"
                    + "apellido VARCHAR(20),"
                    + "dni VARCHAR(9),"
                    + "mesReserva INT(12)"
                    + ")");
            //Metemos unos pocos datos para que ya tenga algo la base de datos
//            int Nreserva[] ={5, 9, 2, 6};
//            int Napartamento[] ={45, 29, 12, 36};
//            String nombres[] = {"Pablo", "Marco", "David", "Sara"};
//            String apellidos[] = {"Barroso", "Asensio", "Crespo", "Martinez"};
//            String[] dni = {"52435622L", "96143309G", "11230054R", "44521109F"};
//            int mesReserva[] ={2, 4, 7, 10};

            //Lo insertamos en la tabla
//            for(int i = 0; i < nombres.length; i++) {
//                st.executeUpdate("INSERT INTO reservas (Nreserva, Napartamento, nombre, apellido, dni, mesReserva) values ('" + Nreserva[i] + "' , '" + Napartamento[i] + "' , '" + nombres[i] + "' , '" + apellidos[i] + "' , '" + dni[i] + "' '" + mesReserva[i] + "')");
//            }
            //Damos las opciones que hay
            while (salir == false) {
                System.out.println("Seleccione una opción:");
                System.out.println("1.- Dar alta reserva");
                System.out.println("2.- Consultar reservas existentes");
                System.out.println("3.- Cancelar reserva");
                System.out.println("3.- Salir");

                Scanner scMenu = new Scanner(System.in);
                int opcionMenu = scMenu.nextInt();

                //Aqui la primera opcion que es colocar los datos de la reserva
                switch (opcionMenu) {
                    case 1:
                        DarAlta(sc, reserva);
                        break;
                    //En el caso dos queremos mostrar las reservas ya hechas
                    case 2:
                        
                    Mostrar();

                    break;
                    case 3:
                        Scanner scc= new Scanner(System.in);
                        
                        System.out.println("Que reserva deseas cancelar:");
                        int nReservas= scc.nextInt();
                        Statement stt= reserva.createStatement();
                        ResultSet resultSet= stt.executeQuery("SELECT * FROM reservas" );
                        if(resultSet.next()){
                            stt.executeUpdate(" DELETE FROM reservas where Nreserva =" + nReservas);
                        } else{
                            System.out.println("No existe esta reserva");
                        }
                        
                        
                        break;

                    case 4:
                        salir = true;
                        break;
                }
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }



    private static void DarAlta(Scanner sc, Connection conectar) throws SQLException {
        System.out.println("Introduzca los datos de la reserva:");
        System.out.println("Nº reserva: ");
        int Nreservas = sc.nextInt();
        System.out.println("Nº apartamento: ");
        int Napartamento = sc.nextInt();
        System.out.print("Nombre: ");
        String nombre = sc.next();
        System.out.print("Apellido: ");
        String apellido = sc.next();
        System.out.print("dni: ");
        String dni = sc.next();
        System.out.println("Mes reserva: ");
        int mesReserva = sc.nextInt();

        Huesped persona= new Huesped(nombre, apellido, dni);
        Reserva reserva= new Reserva(Nreservas, Napartamento, mesReserva, persona);
        
        ReservasAlta.add(reserva);
        
        //Lo insertamos en la tabla
        String nuevaReserva = "INSERT INTO reservas (Nreserva,Napartamento,nombre,apellido,dni,mesReserva) VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement ps = conectar.prepareStatement(nuevaReserva);
        ps.setInt(1, Nreservas);
        ps.setInt(2, Napartamento);
        ps.setString(3, nombre);
        ps.setString(4, apellido);
        ps.setString(5, dni);
        ps.setInt(6, mesReserva);
        ps.executeUpdate();
    }
    
    private static void Mostrar() {
        //Esta manera es recorriendo la base de datos
//      Statement stt= reserva.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
//      ResultSet resultSet= stt.executeQuery("SELECT * FROM reservas");
//      resultSet.afterLast();
//      while(resultSet.previous()){
//      System.out.println(resultSet.getInt(1)+" "+resultSet.getInt(2)+" "+resultSet.getString(3)+" "+resultSet.getString(4)+" "+resultSet.getString(5)+" "+resultSet.getInt(6));
//      }

//      //Este es para recorrer el ArrayList
//      for (int i = 0; i <ReservasAlta.size(); i++) {
//      System.out.println(ReservasAlta.get(i).consulta());
//                        }

        for (Reserva re: ReservasAlta){
            System.out.println(re.consulta());
        }
    }    
}
