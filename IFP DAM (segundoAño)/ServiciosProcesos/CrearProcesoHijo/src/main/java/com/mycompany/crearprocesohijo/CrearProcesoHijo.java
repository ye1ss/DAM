/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.crearprocesohijo;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/**
 *
 * @author Alumno
 */
public class CrearProcesoHijo {
//De primeras he abierto las propiedades de el proyecto le he dado a run y he escogido la main class y luego le he escrito cmd en argumentos
    public static void main(String[] args){
        if(args.length<=0){
        System.out.println("Debe indicase comando ejecutar");
        System.exit(1);
        }
        ProcessBuilder pb= new ProcessBuilder(args);
        pb.inheritIO();//Proceso hereda la entrada y salida del padre
        
        try {
            Process p = pb.start();
            //espera a que termine la ejecución del proceso hijo y obtiene el código de retorno
            int codRet = p.waitFor();//En plan que aqui espera al if de arriba
            System.out.println("La ejecución de "+ Arrays.toString(args) + " devuelve "+ codRet + " " + (codRet==0 ? "(ejecución correcta)" : "(ERROR)"));
            }
            catch (IOException e) {
                System.out.println("Error durante la ejecución del proceso");
                e.printStackTrace();
                System.exit(2);
            } catch (InterruptedException ex) {
                System.out.println("Proceso interrumpido");
            System.exit(3);  
        }
    }
}