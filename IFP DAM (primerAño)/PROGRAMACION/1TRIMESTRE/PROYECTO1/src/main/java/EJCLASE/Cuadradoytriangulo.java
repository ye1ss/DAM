/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejclase;
import java.util.*;

/**
 *
 * @author Alumno
 */
public class Cuadradoytriangulo {

    public static void main(String[] args) {
        System.out.println("Introduce un número");
        Scanner Datos = new Scanner (System.in);
        
        int lado = Datos.nextInt();
        
        for (int fila=1; fila <= lado; fila++ ){
            for (int columna=1; columna<=lado; columna++){
                if(fila==1 || fila==lado || columna==1 || columna==lado){
                  System.out.print("*");
                }
                 else {
                  System.out.print(" ");
                      }       
        }   
            System.out.println("");
            }
    }
}
