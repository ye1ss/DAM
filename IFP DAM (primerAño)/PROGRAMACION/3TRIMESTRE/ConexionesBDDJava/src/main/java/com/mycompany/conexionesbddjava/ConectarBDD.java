/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.conexionesbddjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Alumno
 */
public class ConectarBDD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connection ConectarBDD;
        try{
            //Establecemos conexion con la base de datos
            ConectarBDD= DriverManager.getConnection("jbc:mysql:localhost:3307/test","root","");
            //Creamos un Statement, para realizar la query o consulta(query y consulta es lo mismo)
            Statement consulta= ConectarBDD.createStatement();
            
            String queryl= "insert into personas(nombre, apellido, telefono, fecha) value ('Ana', 'Murua', '6999999', now())";
            System.out.println(queryl);
            consulta.executeUpdate(queryl);
        }
        catch (SQLException ex) {}
        System.out.println("Error en la conexion de base de datos");
    }
    
}




























































//        try (Connection conn = DriverManager.getConnection(url, user, password)) { // Conexión a la base de datos
//            String createTable = "CREATE TABLE IF NOT EXISTS socios (id INT AUTO_INCREMENT PRIMARY KEY, nombre VARCHAR(20), apellido VARCHAR(20), actividad VARCHAR(15))"; // Creación de la tabla de socios
//            Statement stmt = conn.createStatement();
//            stmt.execute(createTable);
//            
//            boolean salir = false;
//            while (!salir) { // Menú principal
//                System.out.println("Seleccione una opción:");
//                System.out.println("1. Alta de socio");
//                System.out.println("2. Modificación de socio");
//                System.out.println("3. Listado de socios");
//                System.out.println("4. Salir");
//                
//                int opcion = Integer.parseInt(System.console().readLine());
//                
//                switch (opcion) {
//                    case 1: // Alta de socio
//                        System.out.println("Introduzca los datos del socio:");
//                        System.out.print("Nombre: ");
//                        String nombre = System.console().readLine();
//                        System.out.print("Apellido: ");
//                        String apellido = System.console().readLine();
//                        System.out.print("Actividad: ");
//                        String actividad = System.console().readLine();
//                        
//                        String insertSocio = "INSERT INTO socios (nombre, apellido, actividad) VALUES (?, ?, ?)"; // Inserción del socio en la tabla
//                        PreparedStatement pstmt = conn.prepareStatement(insertSocio);
//                        pstmt.setString(1, nombre);
//                        pstmt.setString(2, apellido);
//                        pstmt.setString(3, actividad);
//                        pstmt.executeUpdate();
//                        break;
//                        
//                    case 2: // Modificación de socio
//                        System.out.println("Introduzca el id del socio a modificar:");
//                        int id = Integer.parseInt(System.console().readLine());
//                        System.out.println("Introduzca la nueva actividad del socio:");
//                        String nuevaActividad = System.console().readLine();
//                        
//                        String updateSocio = "UPDATE socios SET actividad = ? WHERE id = ?"; // Modificación de la actividad del socio en la tabla
//                        PreparedStatement pstmt2 = conn.prepareStatement(updateSocio);
//                        pstmt2.setString(1, nuevaActividad);
//                        pstmt2.setInt(2, id);
//                        pstmt2.executeUpdate();
//                        break;
//                        
//                    case 3: // Listado de socios
//                        String selectSocios = "SELECT * FROM socios"; // Consulta de todos los socios en la tabla
//                        ResultSet rs = stmt.executeQuery(selectSocios);
//                        
//                        while (rs.next()) {
//                            int idSocio = rs.getInt("id");
//                            String nombreSocio = rs.getString("nombre");
//                            String apellidoSocio = rs.getString("apellido");
//                            String actividadSocio = rs.getString("actividad");
//                            
//                            System.out.println("Id: " + idSocio + ", Nombre: " + nombreSocio + ", Apellido: " + apellidoSocio + ", Actividad: " + actividadSocio);
//                        }
//                        rs.close();
//                        break;
//                        
//                    case 4: // Salir
//                        salir = true;
//                        break;
//                        
//                    default:
