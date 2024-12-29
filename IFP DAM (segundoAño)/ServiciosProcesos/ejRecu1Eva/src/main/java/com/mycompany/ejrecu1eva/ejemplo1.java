/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejrecu1eva;

import java.io.IOException;
import java.util.Arrays;

/**
 *
 * @author yeismil
 */
public class ejemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        if(args.length <= 0){
            System.out.println("Debe indicarse comando a ejecutar.");
            System.exit(1);
        }
        ProcessBuilder pb= new ProcessBuilder(args);
        //se hace que el proceso herede la entrada/salida del padre
        pb.inheritIO();
        try{
            Process p= pb.start();
            //espera que termine la ejecucion del proceso hijo y obtiene el códido de retorno
            int codRet= p.waitFor(); //con este wairFor esperamos el if de arriba
            System.out.println("La ejecución de " +Arrays.toString(args)+ "devuelve " +codRet+ " " +(codRet==0?"(Ejecución correcta)":"(ERROR)"));
        }catch(IOException e){
            System.out.println("Error durante la ejecución del proceso");
            e.printStackTrace();
            System.exit(2);
        }catch(InterruptedException ex){
            System.out.println("Proceso interrumpido");
            System.exit(3);
        }
    }
}
