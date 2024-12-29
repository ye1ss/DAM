/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.maxtiempo;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Alumno
 */
public class MaxTiempo {
    public static int MAX_TIEMPO= 1;
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce la palabra que quieres buscar en el fichero:");
        String palabra= sc.next();
        palabra= "\""+palabra+"\"";
        File archivo= new File("D:\\IFPYeismil\\1Trimestre\\ServiciosProcesos\\MaxTiempo");
        ProcessBuilder pb= new ProcessBuilder();
        pb.directory(archivo);
        pb.command("find", palabra, "comandos.bat");
        pb.inheritIO();
        try{
            Process p= pb.start();
            if(!p.waitFor(MAX_TIEMPO, TimeUnit.MICROSECONDS)){
                p.destroy();
                System.out.printf("El proceso no ha terminado en %d ms\n", MAX_TIEMPO);
            }
            else
                System.out.printf("El proceso ha terminado antes del tiempo limite");
        }catch (IOException e){
            System.out.println("Error durante la ejecución del proceso");
            e.printStackTrace();
        }catch (InterruptedException e){
            System.out.println("Proceso interrumpido");
            e.printStackTrace();
        }
    }
}
