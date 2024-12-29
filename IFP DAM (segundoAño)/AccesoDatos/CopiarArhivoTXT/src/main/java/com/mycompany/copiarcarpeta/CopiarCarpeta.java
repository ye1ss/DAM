/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.copiarcarpeta;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 *
 * @author Yeismil
 */
public class CopiarCarpeta {
//Para este proyecto primero tengo yo que crear un archivo.txt dentro de la carpeta de este proyecto "CopiarCarpeta", y crearlo con el mismo nombre del input entonces cuando se ejecute este programa,
    //se va a crear otro archivo.txt pero output automaticamente, con lo mismo que escribi dento del archivo.txt input.
    public static void main(String[] args)throws IOException {
        //Declaro a vacio null las variables in y out
        FileInputStream in= null;
        FileOutputStream out= null;
        //Declaro un try y in finally para ejecutar la operación
        try{
            in= new FileInputStream("input.txt");
            out= new FileOutputStream("output.txt");
            int c;
            while((c= in.read()) != -1){
                out.write(c);
            }
        }finally{
            if(in != null){
                in.close();
            }
            if(out != null){
                out.close();
            }
        }
    }
}
