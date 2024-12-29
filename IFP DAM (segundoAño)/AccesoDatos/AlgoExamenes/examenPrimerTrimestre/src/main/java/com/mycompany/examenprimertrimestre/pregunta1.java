/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examenprimertrimestre;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Alumno
 */
public class pregunta1 {
    public static void main(String[] args) {
        JFrame ventana= new JFrame("Tienda de Animales");
        ventana.setSize(600,550);
        ventana.setResizable(false);
        
        JMenuBar menuBar= new JMenuBar();

        JMenu Infos= new JMenu("Info");
        JMenuItem menu3= new JMenuItem("Nombre Animales");
        JMenuItem menu4= new JMenuItem("Número Animales");
        JMenuItem menu5= new JMenuItem("Salir");
        
        Infos.add(menu3);
        Infos.add(menu4);
        Infos.add(menu5);
        
        menuBar.add(Infos);
        
        ventana.add(menuBar);
        
        ventana.getContentPane().add(BorderLayout.NORTH, menuBar);
        ventana.setVisible(true);
        
        
        //Connection conexion= null;
        
        try{
            // Establecer la conexión
            String url = "jdbc:mysql://localhost:3306";
            String usuario = "root"; 
            String contraseña = "";
            
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            System.out.println("Conexión exitosa a la base de datos");
            
            //Crear base de datos
            String crearBaseDatos = "CREATE DATABASE IF NOT EXISTS Tienda_de_Animales";
            Statement statement = conexion.createStatement();
            statement.executeUpdate(crearBaseDatos);
            System.out.println("Base de datos TiendaAnimales creada correctamente");
            
            // Seleccionar la base de datos Tienda_de_animales
            String usarBaseDatos = "USE Tienda_de_Animales";
            statement.executeUpdate(usarBaseDatos);
            
            // Crear la tabla animales
            String crearTabla = "CREATE TABLE IF NOT EXISTS animales (" +
                                    "id INT AUTO_INCREMENT PRIMARY KEY," +
                                    "nombre CHAR(40)," +
                                    "especie CHAR(40)" +
                                ")";
            statement.executeUpdate(crearTabla);
            System.out.println("Tabla animales creada correctamente");
            
            // Insertar registros en la tabla animales
            String insertarRegistros = "INSERT INTO animales (nombre, especie) VALUES " +
                                        "('Pez Disco', 'Pez'), " +
                                        "('Rana', 'Anfibio'), " +
                                        "('Galina', 'Aves'), " +
                                        "('Loro', 'Aves'), " +
                                        "('Perro', 'Mamífero')";
            statement.executeUpdate(insertarRegistros);
            System.out.println("Registros insertados correctamente");
            conexion.close();
            
        }catch (Exception e){
            e.printStackTrace();
        }
         menu3.addActionListener(e -> {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Tienda_de_Animales", "root", "");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT nombre FROM animales");

            JTextArea textArea = new JTextArea(15, 40);
            while (rs.next()) {
                textArea.append("Nombre de animales: " + rs.getString("nombre") + "\n");
            }

            JOptionPane.showMessageDialog(null, new JScrollPane(textArea), "Animales registrados", JOptionPane.PLAIN_MESSAGE);

            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    });

    // Acción para el menú 'Mostrar Animales'
    menu4.addActionListener(e -> {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Tienda_de_Animales", "root", "");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT id FROM animales");

            JTextArea textArea = new JTextArea(15, 40);
            while (rs.next()) {
                textArea.append("Número de animales: " + rs.getInt("id") + "\n");
            }

            JOptionPane.showMessageDialog(null, new JScrollPane(textArea), "Número de Animales", JOptionPane.PLAIN_MESSAGE);

            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    });

    ventana.setVisible(true);
        
//        menu3.addActionListener(new ActionListener(){
//            public void actionPerformed(ActionEvent e){
//                JFrame ventana1= new JFrame("Animales registrados");
//                ventana1.setSize(300, 275);
//                ventana1.setResizable(false);
//                
//                try {
//                    // Conexión a la base de datos
//                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Tienda_de_Animales", "root", "");
//                    Statement stmt = con.createStatement();
//                    
//                    // Ejecución de la consulta
//                    ResultSet rs = stmt.executeQuery("SELECT nombre FROM animales;");
//
//                    // Mostrar los resultados en un JTextArea dentro del JPanel
//                    JTextArea textArea = new JTextArea(15, 40);
//                        while (rs.next()) {
//                            textArea.append("Nombre de animales: " + rs.getString("nombre") +"\n");
//                        }
//                    
//                    JScrollPane scrollPane = new JScrollPane(textArea);
//                    ventana.getContentPane().add(scrollPane);
//
//                    con.close();
//                } catch (Exception ex) {
//                    ex.printStackTrace();
//                }
//                
//                ventana.add(ventana1);
//                ventana1.setVisible(true);
//            }
//        });
//        
//        menu4.addActionListener(new ActionListener(){
//            public void actionPerformed(ActionEvent e){
//                JFrame ventana2= new JFrame("Nombre Animales");
//                ventana2.setSize(300, 275);
//                ventana2.setResizable(false);
//                
//                try {
//                    // Conexión a la base de datos
//                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Tienda_de_Animales", "root", "");
//                    Statement stmt = con.createStatement();
//                    
//                    // Ejecución de la consulta
//                    ResultSet rs = stmt.executeQuery("SELECT id FROM animales;");
//
//                    // Mostrar los resultados en un JTextArea dentro del JPanel
//                    JTextArea textArea = new JTextArea(15, 40);
//                        while (rs.next()) {
//                            textArea.append("Numero de animales: " + rs.getInt("id") +"\n");
//                        }
//                    
//                    JScrollPane scrollPane = new JScrollPane(textArea);
//                    ventana.getContentPane().add(scrollPane);
//
//                    con.close();
//                } catch (Exception ex) {
//                    ex.printStackTrace();
//                }
//                ventana.add(ventana2);
//                ventana2.setVisible(true);
//            }
//        });
        
    }
}
