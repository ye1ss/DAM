/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProgramacionSegura;

import java.io.IOException;

/**
 *
 * @author Alumno
 */
public class politica1 {
    
    public static void main(String[] args) {
        System.out.println("Propiedades de seguridad del sistema:");
        System.out.println("-------------------------------------");
        String propiedades[]= {
            "java.class.path", "java.home", "java.vendedor",
            "java.version", "os.name", "os.version", "user.dir", "user.home", "user.name"};
        for (String propiedad: propiedades){
            System.out.println("Propiedad: " +propiedad+ " ");
            try{
                String cadena= System.getProperty(propiedad);
                System.out.println(cadena);
            }catch (Exception ex){
                System.out.println("Error al leer las propiedades de seguridad des distema.");
            }
        }     
    }
}
