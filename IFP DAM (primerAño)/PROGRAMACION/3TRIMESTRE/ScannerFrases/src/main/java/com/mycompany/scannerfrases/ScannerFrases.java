/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.scannerfrases;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class ScannerFrases {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<String> Palabras= new ArrayList();
        String frase;
        
        System.out.println("Introduce una frase :");
        frase=sc.nextLine();
        
        System.out.println("Aqui esta la frase separada en palabras: ");
        Scanner scc= new Scanner(frase);
//        scc.useDelimiter("-");  ESTO ES PARA QUE ME LO SEPARE POR GUIÓN LAS PALABRAS PORQUE POR DEFECTO ES EN EL ESPACIO
        scc.forEachRemaining(Palabras::add);
        for (int i=0; i<Palabras.size();i++){
            System.out.println(Palabras.get(i));
        }
        
        Collections.reverse(Palabras);
        System.out.println("Frase separada en palabras pero alrrevés: " + Palabras);
        
        Collections.sort(Palabras);
        System.out.println("Frase separada en palabras alfabeticamente: " + Palabras);
    }
}
