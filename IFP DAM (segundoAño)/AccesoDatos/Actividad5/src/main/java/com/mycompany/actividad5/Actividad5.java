/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.actividad5;

import java.awt.BorderLayout;
import javax.swing.*;
import java.io.File;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Alumno
 */
public class Actividad5 {
    public static void main(String[] args) {
        // Crea una nueva instancia de FileManager
        FileManager fileManager1= new FileManager();
        }
    public static class FileManager {

        private JFrame frame;
        private JLabel label;
        private JButton button1;
        private JButton button2;
    
        public FileManager() {
            frame = new JFrame("Archivos y Directorios");
            frame.setSize(0,300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            label = new JLabel("Seleccione una opción");
            button1 = new JButton("1. Directorio");
            button2 = new JButton("2. Archivos");

            button1.addActionListener(e -> showDirectories());
            button2.addActionListener(e -> showFiles());

            frame.add(label, BorderLayout.NORTH);
            frame.add(button1, BorderLayout.CENTER);
            frame.add(button2, BorderLayout.SOUTH);

            frame.pack();
            frame.setVisible(true);
        }
    
        private void showDirectories() {
            // Solicitamos el directorio al usuario
            String directorio = JOptionPane.showInputDialog("Introduce el directorio");

            // Creamos un objeto File para el directorio
            File dir = new File(directorio);

            // Obtenemos una lista de los archivos y directorios del directorio
            List<File> files = Arrays.asList(dir.listFiles());

            // Mostramos la lista de archivos y directorios
            label.setText("Archivos y directorios del directorio: " + directorio);
            for (File file : files) {
                label.setText(label.getText() + "\n" + file.getName());
            }
            JOptionPane.showMessageDialog(frame, label.toString(), "Lista de archivos y directorios", JOptionPane.INFORMATION_MESSAGE);
        }

        private void showFiles() {
            // Solicitamos el directorio al usuario
            String directorio = JOptionPane.showInputDialog("Introduce el directorio");

            // Solicitamos la extensión al usuario
            String extension = JOptionPane.showInputDialog("Introduce la extensión");

            // Creamos un objeto File para el directorio
            File dir = new File(directorio);

            // Obtenemos una lista de los archivos del directorio
            List<File> files = Arrays.asList(dir.listFiles());

            // Filtramos la lista para obtener solo los archivos con la extensión solicitada
            List<File> filteredFiles = files.stream()
                    .filter(file -> file.getName().endsWith(extension))
                    .toList();

            // Mostramos la lista de archivos
            label.setText("Archivos del directorio con la extensión " + extension + ":");
            for (File file : filteredFiles) {
                label.setText(label.getText() + "\n" + file.getName());
            }
            JOptionPane.showMessageDialog(frame, label.toString(), "Lista de archivos ", JOptionPane.INFORMATION_MESSAGE);

        }
        
    }

}

