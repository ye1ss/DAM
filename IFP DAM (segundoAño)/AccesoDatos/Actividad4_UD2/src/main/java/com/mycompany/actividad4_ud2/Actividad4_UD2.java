/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividad4_ud2;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Yeismil P
 */
public class Actividad4_UD2 {

    public static void main(String[] args) {
        //Esto es lo que se le añadiria a la actividad3_ud2
        JFrame ventana= new JFrame("Menú");
        ventana.setSize(600,550);
        ventana.setResizable(false);
        
        JMenuBar menuBar= new JMenuBar();

        JMenu Infos= new JMenu("Info");

        JMenuItem menu7= new JMenuItem("Info de Ciudades- país donde opera Sakila");
        JMenuItem menu8= new JMenuItem("Info de Peliculas disponibles en Sakila por duración");
        JMenuItem menu9= new JMenuItem("Info de empleados de Sakila");
        
        menuBar.add(Infos);
        Infos.add(menu7);
        Infos.add(menu8);
        Infos.add(menu9);
        
        menu7.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JFrame ventana1= new JFrame("Info de Ciudades- país donde opera Sakila");
                ventana1.setSize(300, 275);
                ventana1.setResizable(false);
                
                try {
                    // Conexión a la base de datos
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root", "");
                    Statement stmt = con.createStatement();
                    
                    // Ejecución de la consulta
                    ResultSet rs = stmt.executeQuery("SELECT city_id, city FROM city;");

                    // Mostrar los resultados en un JTextArea dentro del JPanel
                    JTextArea textArea = new JTextArea(15, 40);
                        while (rs.next()) {
                            textArea.append("City ID: " + rs.getInt("city_id") + ", City: " + rs.getString("city") + "\n");
                        }
                    
                    JScrollPane scrollPane = new JScrollPane(textArea);
                    ventana1.getContentPane().add(scrollPane);

                    con.close();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                
                ventana1.setVisible(true);
            }
        });
        
        menu8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JFrame ventana1= new JFrame("Info de Peliculas disponibles en Sakila por duración");
                ventana1.setSize(300, 275);
                ventana1.setResizable(false);
                
                try {
                    // Conexión a la base de datos
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/sakila", "root", "root");
                    Statement stmt = con.createStatement();
                    
                    // Ejecución de la consulta
                    ResultSet rs = stmt.executeQuery("SELECT title, rental_duration FROM film order by rental_duration asc;");

                    // Mostrar los resultados en un JTextArea dentro del JPanel
                    JTextArea textArea = new JTextArea(15, 40);
                        while (rs.next()) {
                            textArea.append("Título: " + rs.getString("title") + ", Duración: " + rs.getInt("rental_duration") + "\n");
                        }
                    
                    JScrollPane scrollPane = new JScrollPane(textArea);
                    ventana.getContentPane().add(scrollPane);

                    con.close();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                
                ventana1.setVisible(true);
            }
        });
        
        menu9.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JFrame ventana1= new JFrame("Info de empleados de Sakila");
                ventana1.setSize(300, 275);
                ventana1.setResizable(false);
                
                try {
                    // Conexión a la base de datos
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/sakila", "root", "root");
                    Statement stmt = con.createStatement();
                    
                    // Ejecución de la consulta
                    ResultSet rs = stmt.executeQuery("SELECT customer_id, first_name, last_name, email FROM customer;");

                    // Mostrar los resultados en un JTextArea dentro del JPanel
                    JTextArea textArea = new JTextArea(15, 40);
                        while (rs.next()) {
                            textArea.append("Empleado ID: " + rs.getInt("customer_id") + ", Primer nombre: " + rs.getString("first_name") +
                                    ", Segundo nombre: " + rs.getString("last_name") + ", Email: " + rs.getString("email") + "\n");
                        }
                    
                    JScrollPane scrollPane = new JScrollPane(textArea);
                    ventana.getContentPane().add(scrollPane);

                    con.close();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                
                ventana1.setVisible(true);
            }
        });
        
        ventana.add(menuBar);
        ventana.getContentPane().add(BorderLayout.NORTH, menuBar);
        ventana.setVisible(true);
    }
}
