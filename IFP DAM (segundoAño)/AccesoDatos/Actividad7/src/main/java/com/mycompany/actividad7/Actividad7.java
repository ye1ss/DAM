/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividad7;


import java.awt.HeadlessException;
import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 * @author Alumno
 */
public class Actividad7 {

    public static void main(String[] args) {
        Object[]opciones={"Sobre Archivo","Sobre Directorio","Salir"};
        int seleccion=JOptionPane.showOptionDialog(null, "Elige una opción:", "Menú de permisos",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[2]);
        
                switch(seleccion){
                    case 0:
                        if(verificarPermisosArchivo())return;
                        break;
                    case 1: 
                        if(verificarPermisosDirectorio())return;
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Saliendo de la aplicación");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción no válida");
                        break;
                }
    }

    private static boolean verificarPermisosArchivo() throws HeadlessException {
        String ruta=JOptionPane.showInputDialog(null, "Escribe la ruta completa de un archivo");
        File archivo= new File(ruta);
        if(!archivo.isFile()){
            JOptionPane.showMessageDialog(null, "No ha introducido correctamente un archivo","Error",JOptionPane.ERROR_MESSAGE);
            return true;
        }
        boolean lectura= archivo.canRead(), escritura= archivo.canWrite(), ejecucion= archivo.canExecute();
        String mensaje= String.format("Permisos del archivo:\nLectura: %s\nEscritura: %s\nEjecuión: %s", lectura, escritura, ejecucion);
        JOptionPane.showMessageDialog(null,mensaje,"Permisos del archivo",JOptionPane.INFORMATION_MESSAGE);
        return false;   
    }
    
    public static boolean verificarPermisosDirectorio() throws HeadlessException {
        String ruta=JOptionPane.showInputDialog(null, "Escribe la ruta completa de un directorio");
        File directorio= new File(ruta);
        if(!directorio.isFile()){
            JOptionPane.showMessageDialog(null, "No ha introducido correctamente un archivo","Error",JOptionPane.ERROR_MESSAGE);
            return true;
        }
        boolean lectura= directorio.canRead(), escritura= directorio.canWrite(), ejecucion= directorio.canExecute();
        String mensaje= String.format("Permisos del directorio:\nLectura: %s\nEscritura: %s\nEjecuión: %s", lectura, escritura, ejecucion);
        JOptionPane.showMessageDialog(null,mensaje,"Permisos del directorio",JOptionPane.INFORMATION_MESSAGE);
        return false;
    }
}
