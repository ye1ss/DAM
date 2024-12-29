/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividad1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Yeismil P
 */
public class Actividad1 {
    public static int MAX_TIEMPO=10;
    
    public static void main(String[] args) {
        //Creamos el scaner
        Scanner sc= new Scanner(System.in);
        //Decimos donde va a esatr el txt
        File archivo= new File("C:\\DEVELOPER\\IFP\\ServiciosProcesos\\Actividad1");        
        System.out.println("Introduce la palabra que quieres buscar en el fichero:");
        String palabra= sc.nextLine();
        
        //creamos el processbuilder
        ProcessBuilder pb= new ProcessBuilder();
        pb.directory(archivo);
        //con esto le decimos que busque la palabra introducida
        pb.command("find","\""+palabra+"\"", "actividad1.txt");
        pb.inheritIO();
        try{
            //Iniciamos el proceso
            Process p= pb.start();
            if(!p.waitFor(MAX_TIEMPO, TimeUnit.SECONDS)){
                
                System.out.printf("El proceso se ha detenido en %d ms\n", MAX_TIEMPO);
            }
            else
                System.out.printf("El proceso ha terminado antes del tiempo máximo fijado");
        }catch (IOException e){
            System.out.println("Error durante la ejecución del proceso");
            e.printStackTrace();
        }catch (InterruptedException e){
            System.out.println("Proceso interrumpido");
            e.printStackTrace();
        }
    }
}
