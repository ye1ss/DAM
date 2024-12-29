/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejrecu1eva;

import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 *
 * @author yeism
 */
public class enviarDatos_Input {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ProcessBuilder pb= new ProcessBuilder();
        Map entorno= pb.environment();
        System.out.println("Variables de entorno: ");
        System.out.println(entorno);
        pb= new ProcessBuilder("java", "LeerNombre", "Natalia");
        //comand devuelve los argumentos del proceso
        List lista= pb.command();
        Iterator iterador= lista.iterator();
        System.out.println("\nArgumentos del comando: ");
        while(iterador.hasNext()){
            System.out.println(iterador.next()+"\n");
        }
        //comand("nombre", "comando", "argumentos") ejecuta el comando indicado
        //test= test.command("CMD", "\C", "DIR");
        
        pb= pb.command("CMD", "/C", "DIR");
        try{
            Process p= pb.start();
            InputStream is= p.getInputStream();
            System.out.println();
            int c;
            while((c= is.read())!= -1){
                System.out.print((char)c);
            }
            is.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
