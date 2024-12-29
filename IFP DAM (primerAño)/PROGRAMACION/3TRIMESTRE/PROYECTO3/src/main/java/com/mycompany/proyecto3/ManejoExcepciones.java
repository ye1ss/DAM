/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.proyecto3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


/**
 *
 * @author Alumno
 */
public class ManejoExcepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Crear fichero
        File fichero= new File("fichero.txt");
        System.out.println("Se ha generado el fichero");
        try{
        FileWriter esc= new FileWriter(new File("fichero.txt"));
        BufferedWriter besc= new BufferedWriter(esc);
        //Esto es para escribir dentro del fichero
        besc.write("Hola como estas");
        besc.newLine();
        besc.write("Hoy es 6-3-2023");
        //Esto es para cerrar las lineas en las que he escrito
        besc.close();
        besc.close();
        }
        catch(IOException e){
               System.out.println("Error");
        }
    }
    
}
