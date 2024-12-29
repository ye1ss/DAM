/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.actividaddeportes;

/**
 *
 * @author Alumno
 */
//personas llevan tantos años practicando tal deporte
public class Actividaddeportes {

    public static void main(String[] args) {
        String[][] personas = {
            {"Ana", "1 ", "Futbol"},
            {"Jose", "2 ", "Tenis"},
            {"Tom", "3 ", "Baloncesto"}
        };
        for (int i = 0; i < 3; i++) {
            System.out.printf("Nombre: %s,Año: %s,Deporte: %s\n",
                    personas[i][0], personas[i][1], personas[i][2]);
        }
    }
}
