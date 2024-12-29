/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estudiantes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Estudiantes extends JFrame {

    private JButton crearRegistroBtn;
    private JButton insertarEstudianteBtn;
    private JButton mostrarEstudianteBtn;
    private JButton salirBtn;

    private Connection connection;

    public Estudiantes() {
        setTitle("Gestión de Estudiantes");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        crearRegistroBtn = new JButton("Crear Registro");
        insertarEstudianteBtn = new JButton("Insertar Estudiante");
        mostrarEstudianteBtn = new JButton("Mostrar Estudiantes");
        salirBtn = new JButton("Salir");

        crearRegistroBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                crearTablaRegistro();
            }
        });

        insertarEstudianteBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                insertarEstudiante();
            }
        });

        mostrarEstudianteBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarEstudiantes();
            }
        });

        salirBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        add(crearRegistroBtn);
        add(insertarEstudianteBtn);
        add(mostrarEstudianteBtn);
        add(salirBtn);

        setVisible(true);
    }

    //Aqui intentamos crear la tabla pero ya la creamos anteriormente
    private void crearTablaRegistro() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Estudiantes", "root", "");

            Statement statement = connection.createStatement();
            String query = "CREATE TABLE IF NOT EXISTS Registro (ID INT AUTO_INCREMENT PRIMARY KEY, Nombre VARCHAR(255), Apellidos VARCHAR(255), Edad INT)";
            statement.executeUpdate(query);

            JOptionPane.showMessageDialog(this, "La tabla Registro ha sido creada correctamente o ya existía anteriormente.");
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    //Insertamos los estudiantes a la tabla
    private void insertarEstudiante() {
        try {
            String nombre = JOptionPane.showInputDialog(this, "Ingrese el nombre del estudiante:");
            String apellidos = JOptionPane.showInputDialog(this, "Ingrese los apellidos del estudiante:");
            String edadStr = JOptionPane.showInputDialog(this, "Ingrese la edad del estudiante:");

            int edad = Integer.parseInt(edadStr);

            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Estudiantes", "root", "");

            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO Registro (Nombre, Apellidos, Edad) VALUES (?, ?, ?)");
            preparedStatement.setString(1, nombre);
            preparedStatement.setString(2, apellidos);
            preparedStatement.setInt(3, edad);
            preparedStatement.executeUpdate();

            JOptionPane.showMessageDialog(this, "El estudiante ha sido insertado correctamente.");
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

//mostramos los estudiantes que hay dentro de la tabla
    private void mostrarEstudiantes() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Estudiantes", "root", "");

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM Registro");

            StringBuilder estudiantes = new StringBuilder();
            while (resultSet.next()) {
                estudiantes.append("ID: ").append(resultSet.getInt("ID"))
                        .append(", Nombre: ").append(resultSet.getString("Nombre"))
                        .append(", Apellidos: ").append(resultSet.getString("Apellidos"))
                        .append(", Edad: ").append(resultSet.getInt("Edad"))
                        .append("\n");
            }

            JOptionPane.showMessageDialog(this, estudiantes.toString());
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Estudiantes();
            }
        });
    }
}


