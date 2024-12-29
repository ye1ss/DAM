/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lanzarhilo;

/**
 *
 * @author Alumno
 */
public class LanzarHilo2 {
    public static void main(String[]args){
        Runnable task= new MiRunnable();
        Thread hilo= new Thread(task);
        hilo.start();
        System.out.println("My name is "+Thread.currentThread().getName()
                +", state: "+Thread.currentThread().getState());
    }
}
class MiRunnable implements Runnable{
    @Override
    public void run(){
        /*El metodo runnable no tiene de por si el Thread.currentThread().getName() por eso hay que ponerlo asi,
        si no se pondria como antes this.getName()*/
        System.out.println("My name is: "+Thread.currentThread().getName()
                +" ,state: "+Thread.currentThread().getState());
    }
}