/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.bbdd;

import java.time.LocalDate;

/**
 *
 * @author Alumno
 */
public class Bbdd {

    public static void main(String[] args) {
     GestorPersonas gp = new GestorPersonas();
     gp.insertar(new Persona("RaulRamon","Ramon","965856892",LocalDate.now()));
        
    }
}
