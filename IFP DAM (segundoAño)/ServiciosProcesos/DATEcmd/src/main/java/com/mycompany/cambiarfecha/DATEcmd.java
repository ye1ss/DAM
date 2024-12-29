/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cambiarfecha;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author Alumno
 */
public class DATEcmd {

    public static void main(String[] args) throws IOException {
        ProcessBuilder pb= new ProcessBuilder("CMD","/C","DATE");
        Process p= pb.start();
        //Process p= new ProcessBuilder("CMD","/C","DATE").start;ESTO ES LO MISMO QUE LAS DOS LÍNEAS DE ARRIBA
        OutputStream os= p.getOutputStream();
        os.write("11-07-23".getBytes());//El .getBytes es para convertirlo en bytes porque al estar entre comillas esta en string
        os.flush();
        
        InputStream is= p.getInputStream();
        int c;
        while((c= is.read())!= -1){
            System.out.println((char)c);
        }
        is.close();
        int exitVal;
        try{
            exitVal= p.waitFor();
            System.out.println("Valor de salida: "+exitVal);
            if(exitVal== 0)
                System.out.println("El proceseo a finalizado correctamente");
            else
                System.out.println("Error, no se cambio la fecha por falta de permisos");            
            }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
