/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.crearbasedatosjava;
//primero en el pom.xml que esta a la izquierda en proyect files, cargamos la libreria de lo de dependences y copias lo que he puesto dento de <dependencies> que lo busque en google en mvnrepository
//buscamos mysql y lo de 8.0.32

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class CrearBaseDatosJava {

    public static void main(String[] args) {
        
        int x= 0;
        Scanner sc =new Scanner(System.in);
        GestorPersona gp= new GestorPersona();
        
        do{
            System.out.println("0 -Salir y 1 -Insertar");
            x=sc.nextInt();
        switch(x){
            case 0 ->{System.out.println("Gracias por usar la aplicación");}
            case 1->{
                System.out.println("Introduce el nombre");
                String nombre = sc.next();
                System.out.println("Introduce el apellido");
                String apellido = sc.next();
                System.out.println("Introduce el telefono");
                String telefono = sc.next();
                gp.insertar (new Persona(nombre, apellido, telefono, LocalDate.now()));
            }
            default->{System.out.println("No existe la opción");}
            }
        }
    }
}
