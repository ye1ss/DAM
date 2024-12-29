/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reservaapartamento;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Jorge Wang Wang
 */
public class gestionReserva {
    Conectar c1 = new Conectar();
    public void crearTabla(){
        //crea la tabla 
        try {
           Statement consulta = c1.conectar().createStatement();
        String query1 = "Create table reserva(numero_reserva int auto_increment primary key not null, numero_apartamento int not null,nombre varchar(20), apellido varchar(20), dni varchar(10), mes varchar(20));" ;//crea una tabla
        consulta.executeUpdate(query1);// lo ejecuta
        } catch (SQLException ex) {//en caso que ya exista
            System.out.println("La tabla Ya esta creada");
        }    
    }
    public void insertarReserva(reserva r1){
        try {
            
            Statement consulta = c1.conectar().createStatement();
            //recoge los datos y los sustituye en el values
            String query1 ="insert into reserva(numero_apartamento,mes,nombre,apellido,dni) values('"+r1.getNumero() +"','"+r1.getMes()+"','"+r1.getHuesped().getNombre()+"','"+r1.getHuesped().getApellido()+"','"+ r1.getHuesped().getDNI()+"')";//coge los datos de la clase
            consulta.executeUpdate(query1);//importa el comando a sql
            System.out.println("Se realizo con exito la reserva");//confirma que se realizo con exito
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error");
        }        
    }
    
    public ArrayList<reserva> RellenarArrayList(){
        ArrayList<reserva> aparta = new ArrayList<reserva>();
        try {
            //Rellena el arrayList
            Statement consulta = c1.conectar().createStatement();
            String query1 = "Select * from reserva";
            ResultSet rs = consulta.executeQuery(query1);
            //lo va introduciendo
            while(rs.next()){
                aparta.add(new reserva(rs.getInt("numero_apartamento"),rs.getString("mes"),new Huesped(rs.getString("nombre"),rs.getString("apellido"),rs.getString("DNI"))));
                
            }
            
        } catch (SQLException ex) {
            System.out.println("Error");
        }
        return aparta;//lo devuelve
    }
    public void ConsultarReserva(){
        try {
            Statement consulta = c1.conectar().createStatement();
            String query1 = "Select * from reserva";//seleccionamos todos los datos
            ResultSet rs = consulta.executeQuery(query1);// lo mandamos a la base de datos
            while(rs.next()){//imprime todos los datos
                System.out.println("numero de reserva: " +rs.getInt("numero_reserva")+" numero apartamento: "+rs.getInt("numero_apartamento") + " mes " + rs.getString("mes")+" Nombre del huesped: " +rs.getString("Nombre")+" Apellido: " + rs.getString("apellido")+" DNI: " +rs.getString("dni"));
                
            }
            
        } catch (SQLException ex) {
            System.out.println("Error");
        }
    }
    public void EliminarReserva(int numero){
        try {
            Statement consulta = c1.conectar().createStatement();
            String query1 = "Delete from reserva where numero_reserva = " + numero;//recoge el numero seleccionado por el usario
            consulta.executeUpdate(query1);// lo elimina

        } catch (SQLException ex) {
            System.out.println("Error");
        }
    }
}
    

