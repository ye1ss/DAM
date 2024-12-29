/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividad6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Alumno
 */
public class Actividad6 {
    public static void main(String[] args) {
        String origen= JOptionPane.showInputDialog(null, "Ruta del archivo de origen:");
        String destino= JOptionPane.showInputDialog(null, "Ruta del archivo de destino: ");
        
        File archivoOrigen= new File(origen);
        File archivoDestino= new File(destino);
        
        if (archivoOrigen.exists() && archivoOrigen.isFile()) {
            if (archivoDestino.exists() && archivoDestino.isFile()) {
                int opcion = JOptionPane.showConfirmDialog(null, "El archivo destino ya existe. ¿Quieres reemplazarlo?", "Aviso", JOptionPane.YES_NO_OPTION);
                if (opcion == JOptionPane.YES_OPTION) {
                    realizarCopia(archivoOrigen, archivoDestino);
                    JOptionPane.showMessageDialog(null, "El archivo fue copiado exitosamente.");
                } else {
                    JOptionPane.showMessageDialog(null, "Operación cancelada.");
                }
            } else if (archivoDestino.exists() && archivoDestino.isDirectory()) {
                File archivoDestinoFinal = new File(archivoDestino, archivoOrigen.getName());
                realizarCopia(archivoOrigen, archivoDestinoFinal);
                JOptionPane.showMessageDialog(null, "El archivo fue copiado exitosamente.");
            } else {
                realizarCopia(archivoOrigen, archivoDestino);
                JOptionPane.showMessageDialog(null, "El archivo fue copiado exitosamente.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "El archivo de origen no existe o no es válido.");
        }
    }

    private static void realizarCopia(File origen, File destino) {
        try (FileInputStream fis = new FileInputStream(origen);
             FileOutputStream fos = new FileOutputStream(destino)) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al copiar el archivo: " + e.getMessage());
        }
    }
}
