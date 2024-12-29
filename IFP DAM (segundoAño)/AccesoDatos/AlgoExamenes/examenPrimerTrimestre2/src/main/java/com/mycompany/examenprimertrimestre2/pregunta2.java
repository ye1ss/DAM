/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examenprimertrimestre2;

import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Alumno
 */
public class pregunta2 {

    public static void main(String[] args) {
        // Apartado 1
        String directorio = JOptionPane.showInputDialog(null, "Introduce el nombre del directorio que se crea:");
        String rutaDirectorio = "C:\\" + directorio; // Ruta en C:\

        // Creamos el directorio en la ruta especificada por el usuario
        File directorioCrear = new File(rutaDirectorio);
        boolean creado = directorioCrear.mkdirs();

        if (creado) {
            JOptionPane.showMessageDialog(null, "Directorio creado exitosamente en " + rutaDirectorio);

            // Crear tres ficheros de texto en el directorio especificado
            for (int i = 1; i <= 3; i++) {
                String nombreFichero = JOptionPane.showInputDialog(null, "Introduce el nombre del fichero " + i + ":");
                String rutaFichero = rutaDirectorio + "\\" + nombreFichero + ".txt";
                File fichero = new File(rutaFichero);

                try {
                    if (fichero.createNewFile()) {
                        JOptionPane.showMessageDialog(null, "Fichero " + nombreFichero + " creado en " + rutaDirectorio);
                    } else {
                        JOptionPane.showMessageDialog(null, "El fichero " + nombreFichero + " ya existe en " + rutaDirectorio);
                    }
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(null, "Error al crear el fichero " + nombreFichero);
                    e.printStackTrace();
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error al crear el directorio en " + rutaDirectorio);
        }

        // Apartado 2
        // Mostrar los nombres de los ficheros en el directorio creado por el usuario
        File[] ficheros = directorioCrear.listFiles();
        StringBuilder nombresFicheros = new StringBuilder("Ficheros en el directorio " + rutaDirectorio + ":\n");

        if (ficheros != null) {
            for (File fichero : ficheros) {
                nombresFicheros.append(fichero.getName()).append("\n");
            }
        } else {
            nombresFicheros.append("Directorio vacío o no existente");
        }

        JOptionPane.showMessageDialog(null, nombresFicheros.toString());
    }
}

