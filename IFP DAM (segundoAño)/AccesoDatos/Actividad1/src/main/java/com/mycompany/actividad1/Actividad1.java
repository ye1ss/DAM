/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.actividad1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 *
 * @author Alumno
 */
public class Actividad1 {

        public static void main(String[] args) {
        File f= null;
        File g= null;
        FileInputStream in= null;
        FileOutputStream out= null;
        
        String[] strs={"File1.txt", "File2.txt","File3.txt"};
        /*Vamos a crear un for para recorrer un vector(array) y utilizar los métodos del objetp File para ver si es ejecutable o no.
        Utilizamos el try y catch para capturar las excepciones que es necesario cuando utilizamos las clase file o clases de acceso a fichero*/
        try{
            for(String s:strs){
                f= new File(s);
                //Veo si el fichero file1 que he leido del vector es ejecutable o no mediante el metodo canExecute
                boolean bool= f.canExecute();
                //Miro la ruta absoluta del fichero con (getAbsolutePath)
                String b= f.getAbsolutePath();
                //Imprimo los resultados de los métodos canExecute y getAbsolutePath
                System.out.println();
                System.out.println(b);
                System.out.println();
                System.out.println("El fichero es ejecutable: "+ bool);
                int i=0;
                do{
                    i++;
                }while(i !=3);
            }
            g= new File("d:/Proyectos Oracle Java Ada/File4.txt");
            
        
        }catch(Exception e){
            System.out.println("Fallo");
        }
        /*Ahora viene la parte en la que pedimos al usuario sus datos personales y los escribimos en file4.txt
        y luego lo sacamos por pantalla*/
        
    }
}
