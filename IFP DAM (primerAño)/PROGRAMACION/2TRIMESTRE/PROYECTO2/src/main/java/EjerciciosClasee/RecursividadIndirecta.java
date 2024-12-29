/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package EjerciciosClasee;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class RecursividadIndirecta {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un número");
        int numero = entrada.nextInt();
        String resultado = "";
        if (impar(numero)) {
            resultado = "impar";
        } else {
            resultado = "par";
        }
        System.out.println("El número " + numero + " es " + resultado);
    }

    public static boolean impar(int numero) {
        if (numero == 0) {
            return false;
        } else {
            return par(numero - 1);
        }
    }

    public static boolean par(int numero) {
        if (numero == 0) {
            return true;
        } else {
            return impar(numero - 1);
        }
    }

}
