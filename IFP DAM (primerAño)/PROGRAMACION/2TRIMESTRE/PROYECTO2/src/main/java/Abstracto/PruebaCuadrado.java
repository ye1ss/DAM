package Abstracto;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Alumno
 */
public class PruebaCuadrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String colorDelCuadrado;
        double ladoDelCuadrado;
        
        Scanner teclado= new Scanner(System.in);
        
        System.out.print("Introduzca el color del cuadrado: ");
        colorDelCuadrado= teclado.nextLine();
        
        System.out.print("Introduzca el lado del cuadrado: ");
        ladoDelCuadrado= teclado.nextDouble();
        
        Cuadrado cuadrado1= new Cuadrado(colorDelCuadrado, ladoDelCuadrado);
        
        System.out.printf("El area del cuadrado %s es: %.2f ", cuadrado1.getColor(), cuadrado1.calcularArea());
        //Se pone solo f le he puesto un .2 adelante para q me de dos decimales
    }
    
}
