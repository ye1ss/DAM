/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.creareditarficheros;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Alumno
 */
public class CrearEditarFicheros {

    public static void main(String[] args) throws IOException {
        File archivo= new File("CrearEditarPrueba.txt");
        //Creamos el fichero
        archivo.createNewFile();
        //Creamos el objeto escribir
        FileWriter escribir= new FileWriter(archivo);
        //Esto es el contenido que quiero que este dentro del fichero
        escribir.write("Esto\n es\n un ejemplo");
        escribir.flush();
        escribir.close();
        //Creamos el objeto filereader ESTO ES PARA LEER EL ARCHIVO CREADO,(lo que hay dentro del archivo creado)
        FileReader fr= new FileReader(archivo);
        char[] a= new char[50];
        fr.read(a);
        
        for(char c : a)
            System.out.print(c);
        fr.close();
        
    }
}


//String ruta="C:\\Users\\Alumno\\OneDrive - IFP Formación Profesional\\SegundoAñoDamYeismil\\1Trimestre\\AccesoDatos\\CrearEditarFicheros";
//        File archivo= new File(ruta);
//        
//        BufferedWriter bw;
//        
//        if(archivo.exists()){
//            System.out.println("El fichero ya existe");
//        }else{
//            System.out.println("El fichero no existe, hay que crearlo");
//        }
//        if(!archivo.exists()){
//            archivo.createNewFile("");
//        }else{
//            
//        }