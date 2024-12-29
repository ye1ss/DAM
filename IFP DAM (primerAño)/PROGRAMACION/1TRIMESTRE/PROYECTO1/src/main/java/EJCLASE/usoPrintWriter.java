package com.mycompany.ejclase;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alumno
 */
public class usoPrintWriter {
    
public static void escribirfichero()throws IOException{
    PrintWriter salida;
    salida= new PrintWriter(new FileWriter("Carpeta/fichero.txt",true));
    salida.print("escribir texto en fichero\n");
    salida.write("segunda línea\n");
    salida.append("mas datos");
    salida.close();
}
    
}
