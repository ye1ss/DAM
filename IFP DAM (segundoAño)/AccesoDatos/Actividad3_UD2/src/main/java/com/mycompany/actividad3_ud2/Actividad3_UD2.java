/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividad3_ud2;

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
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Yeismil P
 */

//cambie 19 por 17 para clase en el pom
public class Actividad3_UD2 {

    public static void main(String[] args) {
        JFrame ventana= new JFrame("Menú");
        ventana.setSize(600,550);
        ventana.setResizable(false);

        JMenuBar menuBar= new JMenuBar();

        JMenu Infos= new JMenu("Info");

        JMenuItem menu1= new JMenuItem("Info tabla Payment");
        JMenuItem menu2= new JMenuItem("Info tabla Rental");
        JMenuItem menu3= new JMenuItem("Info tabla Store");
        JMenuItem menu4= new JMenuItem("Info tabla Payment-customer");
        JMenuItem menu5= new JMenuItem("Info tabla Costomer");
        JMenuItem menu6= new JMenuItem("Info tabla Staff");

        menuBar.add(Infos);
        Infos.add(menu1);
        Infos.add(menu2);
        Infos.add(menu3);
        Infos.add(menu4);
        Infos.add(menu5);
        Infos.add(menu6);

        
        menu1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JFrame ventana1= new JFrame("Info tabla Payment");
                ventana1.setSize(300, 275);
                ventana1.setResizable(false);
                
                try {
                    // Conexión a la base de datos
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/sakila", "root", "root");
                    Statement stmt = con.createStatement();
                    
                    // Ejecución de la consulta
                    ResultSet rs = stmt.executeQuery("SELECT payment_id, customer_id, amount, payment_date FROM payment;");

                    // Mostrar los resultados en un JTextArea dentro del JPanel
                    JTextArea textArea = new JTextArea(15, 40);
                        while (rs.next()) {
                            textArea.append("Payment ID: " + rs.getInt("payment_id") + ", Customer ID: " + rs.getInt("customer_id") +
                                ", Amount: " + rs.getDouble("amount") + ", Payment Date: " + rs.getString("payment_date") + "\n");
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
        
        menu2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JFrame ventana1= new JFrame("Info tabla Rental");
                ventana1.setSize(300, 275);
                ventana1.setResizable(false);
                
                try {
                    // Conexión a la base de datos
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/sakila", "root", "root");
                    Statement stmt = con.createStatement();
                    
                    // Ejecución de la consulta
                    ResultSet rs = stmt.executeQuery("SELECT rental_id, customer_id, return_date FROM rental;");

                    // Mostrar los resultados en un JTextArea dentro del JPanel
                    JTextArea textArea = new JTextArea(15, 40);
                        while (rs.next()) {
                            
                            textArea.append("Rental_ID: " + rs.getInt("rental_id") + ", Customer ID: " + rs.getInt("customer_id") /*+
                                ",Date: " + formattedDate*/+ "\n");
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
        
        menu3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JFrame ventana1= new JFrame("Info tabla Store");
                ventana1.setSize(300, 275);
                ventana1.setResizable(false);
                
                try {
                    // Conexión a la base de datos
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/sakila", "root", "root");
                    Statement stmt = con.createStatement();
                    
                    // Ejecución de la consulta
                    ResultSet rs = stmt.executeQuery("SELECT store_id, address_id  FROM store;");

                    // Mostrar los resultados en un JTextArea dentro del JPanel
                    JTextArea textArea = new JTextArea(15, 40);
                        while (rs.next()) {
                            textArea.append("Store ID: " + rs.getInt("store_id") + ", Address ID: " + rs.getInt("address_id")+ "\n");
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
        
        menu4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JFrame ventana1= new JFrame("Info tabla Payment-Customer");
                ventana1.setSize(300, 275);
                ventana1.setResizable(false);
                
                try {
                    // Conexión a la base de datos
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/sakila", "root", "root");
                    Statement stmt = con.createStatement();
                    
                    // Ejecución de la consulta
                    ResultSet rs = stmt.executeQuery("SELECT payment_id, customer_id, amount, payment_date FROM payment WHERE amount >3;");

                    // Mostrar los resultados en un JTextArea dentro del JPanel
                    JTextArea textArea = new JTextArea(15, 40);
                        while (rs.next()) {
                            
                            textArea.append("Payment ID: " + rs.getInt("payment_id") + ", Customer ID: " + rs.getInt("customer_id") +
                                ", Amount: " + rs.getDouble("amount") + ", Payment Date: " + rs.getString("payment_date") + "\n");
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
        
        menu5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JFrame ventana1= new JFrame("Info tabla Payment-Customer");
                ventana1.setSize(300, 275);
                ventana1.setResizable(false);
                
                try {
                    // Conexión a la base de datos
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/sakila", "root", "root");
                    Statement stmt = con.createStatement();
                    
                    // Ejecución de la consulta
                    ResultSet rs = stmt.executeQuery("SELECT customer_id, first_name FROM customer WHERE active = TRUE;");

                    // Mostrar los resultados en un JTextArea dentro del JPanel
                    JTextArea textArea = new JTextArea(15, 40);
                        while (rs.next()) {
                            
                            textArea.append("Customer ID: " + rs.getInt("customer_id") + ", First_Name: " + rs.getString("first_name")+"\n");
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
        
        menu6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JFrame ventana1= new JFrame("Info tabla Staff");
                ventana1.setSize(300, 275);
                ventana1.setResizable(false);
                
                try {
                    // Conexión a la base de datos
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/sakila", "root", "root");
                    Statement stmt = con.createStatement();
                    
                    // Ejecución de la consulta
                    ResultSet rs = stmt.executeQuery("SELECT first_name, last_name, address_id, store_id FROM staff WHERE active = TRUE;");

                    // Mostrar los resultados en un JTextArea dentro del JPanel
                    JTextArea textArea = new JTextArea(15, 40);
                        while (rs.next()) {
                            
                            textArea.append("First Name: " + rs.getString("first_name") + ", Last Name: " + rs.getString("last_name")+
                                   ", Address ID: " + rs.getInt("address_id") + ", Store ID: " + rs.getInt("store_id")+"\n");
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
