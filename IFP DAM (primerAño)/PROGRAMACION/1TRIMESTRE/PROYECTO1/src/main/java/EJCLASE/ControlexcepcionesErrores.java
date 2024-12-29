/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.controlexcepciones.errores;

/**
 *
 * @author Alumno
 */
public class ControlexcepcionesErrores {

   
    public static void main(String[] args) {
        int numerador= 60;
        int denominador=10;
        //poner aqui el try es para cuando se divida entre cero no de error
        //el try es para q el programa vea por donde esta el error
        try{
        System.out.println("la division de "+numerador+" entre "+denominador+" es "+numerador/denominador);
    }
        //por que aqui pongo lo que quiero q me ponga en caso de error
        catch (ArithmeticException e){
        System.out.println("No se puede dividir entre cero, indica otro valor");
        //e.printStackTrace(); <-(esto no se para q es)
        //si pongo dos de estos para los errores solo coje la excepción mas específica
        }
    }
}    