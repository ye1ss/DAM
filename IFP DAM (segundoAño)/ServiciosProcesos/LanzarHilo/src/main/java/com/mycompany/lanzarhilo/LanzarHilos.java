/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lanzarhilo;

/**
 *
 * @author Alumno
 */
public class LanzarHilos {
    public static void main(String[] args){
        Thread hilo1= new Thread(() ->{
            System.out.println("Soy el hilo 1");});
        Thread hilo2= new Thread(() ->{
            System.out.println("Soy el hilo 2");});
        Thread hilo3= new Thread(() ->{
            System.out.println("Soy el hilo 3");});
        
        Thread.getAllStackTraces().keySet().forEach(thread -> {
        System.out.println("Nombre: "+thread.getName()+"Estado: ");
        System.out.println(thread.getState());
        });
        
        //No tienen porqué ejecutarse en orden con el (hilo1.start();)pero con .run() si se ejecuta en orden porque espera a que termine el primer run y luego va al siguente el start lo hace todo a la vez
        System.out.println("Inicio");
        hilo1.run();
        hilo2.run();
        hilo3.run();
        System.out.println("Fin");
        
        Thread.getAllStackTraces().keySet().forEach(thread -> {
        System.out.println("Nombre: "+thread.getName()+"Estado: ");
        System.out.println(thread.getState());
        });
    }
}
