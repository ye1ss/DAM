/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.leerconsola;
import java.io.*;
/**
 *
 * @author Yeismil
 */
public class LeerConsola {
//Esto es a la consola de NetBeans no va a hacer nada solo volver a imprimir lo que pones
    public static void main(String args[]) throws IOException {
        System.out.println("Bienvenido a leector de caracteres del usuario");
        System.out.println();
        //Declaro la variable InputStreamReader
        InputStreamReader cin = null;
        try {
            //instancio la clase inputStreamReader y le paso al constructor la entrada -system.in*/
            cin = new InputStreamReader(System.in);
            System.out.println("Introduce el caracter q para salir");
            char c;
            do {
            c = (char) cin.read();
            System.out.print(c);
        } while(c != 'q');
        }finally {
            if (cin != null) {
            cin.close();
            }
        }
    }
}

