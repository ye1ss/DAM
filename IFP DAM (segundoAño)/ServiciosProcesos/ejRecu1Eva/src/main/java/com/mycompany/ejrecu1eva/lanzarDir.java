/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejrecu1eva;

import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author yeismil
 */
public class lanzarDir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
//        Process p= new ProcessBuilder("CMD", "/C", "DIR").start();
//        InputStream is= p.getInputStream();
//        
//        int c= 0;
//        while((c= is.read()) != -1){
//            System.out.print((char)c);
//        }

// REUTILIZO EL EJ DE ARRIBA PARA UNO NUEVO AQUÍ ABAJO

        Process p= new ProcessBuilder("CMD", "/C", "DIR").start();
        try{
            InputStream is= p.getInputStream();

            int c= 0;
            while((c= is.read()) != -1){
                System.out.print((char)c); //hacemos un print normal para que no nos aparezca una letra en cada línea
            }
            is.close();    
        }catch(Exception e){
            e.printStackTrace();
        }
        try{
            int exitVal= p.waitFor();
            System.out.println("Valor de salida: " +exitVal);    
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        
    }
    
}
