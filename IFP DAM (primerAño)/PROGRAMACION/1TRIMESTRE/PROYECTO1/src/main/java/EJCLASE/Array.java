/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package EJCLASE;

import java.util.*;

/**
 *
 * @author Alumno
 */
public class Array {

    public static void main(String[] args) {
        //array de enteros
        int[]numeroAlumno = new int[5];
        
        numeroAlumno[0]=5;
        numeroAlumno[1]=11;
        numeroAlumno[2]=43;
        numeroAlumno[3]=24;
        numeroAlumno[4]=6;
     
        int[]notaAlumno={5,6,7,8,9,10};
        
        String[] nombres={"Ana","Alba","Ivan","Erik","Jose"};
        for(int i=0; i<numeroAlumno.length; i++){
        System.out.printf("%d \n",numeroAlumno[i]);
}
        for(int i =0;i < numeroAlumno.length;i++){
            System.out.printf("%d %s tiene un %d de nota\n",numeroAlumno[i],nombres[i],notaAlumno[i]);
        }
        int media=0;
        for(int i:notaAlumno){
           System.out.printf("%d ",i);
    }
        System.out.printf("\nLa media de las notas es %d\n",media/5);
        
       
        
        
        
        
        
        
        
}
    
    
    
    }

