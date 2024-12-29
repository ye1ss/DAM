/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividad3swing;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTextArea;


/**
 *
 * @author Yeismil P
 */
public class Actividad3Swing {

    public static void main(String[] args) {
        JFrame ventana = new JFrame("Ficheros");

        JFileChooser selectorArchivo = new JFileChooser();
        selectorArchivo.setFileSelectionMode(JFileChooser.FILES_ONLY);

        int resultado = selectorArchivo.showOpenDialog(ventana);

        if (resultado == JFileChooser.APPROVE_OPTION) {
            File archivo = selectorArchivo.getSelectedFile();

            try {
                FileReader lector = new FileReader(archivo);
                JTextArea areaTexto = new JTextArea();

                int caracter;
                while ((caracter = lector.read()) != -1) {
                    areaTexto.append(Character.toString((char) caracter));
                }

                ventana.add(areaTexto);
                ventana.setSize(300, 200);
                ventana.setVisible(true);

                lector.close();
            } catch (IOException e) {
                System.out.println("Hubo un error al leer el archivo");
                e.printStackTrace();
            }
        }
    }
}
