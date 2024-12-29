/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.clubmontebd;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class ClubMonteBD {

    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      GestorSocios gs = new GestorSocios();

        System.out.println("Introduzca los datos del socio:");
        System.out.print("Nombre: ");
        String name = System.console().readLine();
        System.out.print("Apellido: ");
        String lastname = System.console().readLine();
        System.out.print("Actividad: ");
        String actividad = System.console().readLine();

        gs.insertar(new Socios(name, lastname, actividad));
                        
//      String nombre;
//      String apellido;
//      String actividad;
//      
//        System.out.println("Nombre del socio: ");
//        System.out.println("Apellido del socio: ");
//        System.out.println("Actividad del");
//       
    }
}