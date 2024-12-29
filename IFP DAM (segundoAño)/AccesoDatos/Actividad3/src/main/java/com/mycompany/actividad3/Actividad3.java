/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividad3;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Actividad3 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Escribe una ruta donde inttroducir el fichero: ");
        String ruta= sc.next();
        
        System.out.println("Escribe como quieres que se llame el fichero:");
        String fichero= sc.next();
        
        System.out.println("Escribe el texto que quieres que tenga el fichero: ");
        String texto= sc.next();
        
        // Llamar a la función para escribir en el archivo
        escribirFichero(ruta, fichero, texto);

        // Cerrar el scanner
        sc.close();
        
    }

    private static void escribirFichero(String ruta, String fichero, String texto) {
        try{
            File archivo= new File(fichero);
            //Creamos el fichero
            archivo.createNewFile();
            //Creamos el objeto fr para escribir
            FileWriter escribir= new FileWriter(archivo);
            escribir.write(texto);
            escribir.flush();
            escribir.close();
            
            FileReader fr= new FileReader(archivo);
            int caracter;
            System.out.println("Contenido del archivo " + archivo.getPath() + ":");
            while ((caracter = fr.read()) != -1) {
                System.out.print((char) caracter);
            }
            fr.close();
            
        }catch(IOException e){
            System.out.println("\"Hubo un error al escribir en el archivo.\"");
            e.printStackTrace();
        }
    }
}
