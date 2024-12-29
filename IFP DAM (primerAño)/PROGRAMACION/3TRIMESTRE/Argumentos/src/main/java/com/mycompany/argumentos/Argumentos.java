/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.argumentos;

/**
 *
 * @author Alumno
 */
public class Argumentos {

    public static void main(String[] args) {
        int i= args.length;
        while(i > 0){
            System.out.println(args[i-1]+ " ");
            i--;
        }
        System.out.println();
    }
}
