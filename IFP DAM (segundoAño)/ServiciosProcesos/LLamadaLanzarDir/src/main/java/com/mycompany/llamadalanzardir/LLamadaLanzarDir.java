/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.llamadalanzardir;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author Alumno
 */
public class LLamadaLanzarDir {
    //Quitarlo de one drive si no no va a ir
    public static void main(String[] args) throws IOException {
        File directorio= new File("D:\\IFPYeismil\\1Trimestre\\ServiciosProcesos\\LanzarDir\\src\\main\\java\\com\\mycompany\\lanzardir");//Aqui poner la ruta del proyecto lanzar dir
        ProcessBuilder pb= new ProcessBuilder("java", "LanzarDir.java");
        
        pb.directory(directorio);
        
        System.out.printf("Directorio de trabajo: %s%n", pb.directory());
        System.out.println("***Ejecución de la aplicacion LanzarDIR***\n");
        
        Process p= pb.start();
        try{
            InputStream is= p.getInputStream();
            int c= 0;
            while((c=is.read())!=-1){
                System.out.print((char)c);
            }
            is.close();
        }catch(Exception e){e.printStackTrace();}
    }
}

