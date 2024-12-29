/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.leervariablesentorno;

import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Alumno
 */
public class LeerVariablesEntorno {

    public static void main(String[] args) {
        ProcessBuilder pb= new ProcessBuilder();
        Map entorno= pb.environment(); //devuelve las variables de entorno
        System.out.println("Vriables de entorno: ");
        System.out.println(entorno);
        pb= new ProcessBuilder("java", "LeerNombre", "Nicole");
        //comand() devuelve los argumentos de proceso
        List lista= pb.command();
        Iterator iterador= lista.iterator();
        System.out.println("\nAegumentos del comando: ");
        while(iterador.hasNext()){
            System.out.println(iterador.next()+"\n");
        }
        //el metodo comand("nombre", "comando", "argumentos")ejecuta el comando indicado
        //cambiamos el comando a ejecutar, pues el que hemos puesto antes no es un comando existente
        pb= pb.command("CMD", "/C", "DIR");
        try{
            Process p= pb.start();
            InputStream is= p.getInputStream();
            System.out.println();
            int c;
            while((c= is.read())!=-1){
                System.out.println((char) c);
            }
            is.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
