/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lanzarhilo;

/**
 *
 * @author Alumno
 */
public class LanzarHilo {

    public static void main(String[] args) {
        System.out.println("--LANZAR MI HILO--\n");
        //Aqui le pregunto que hilo se esta ejecutando ahora mismo y le pido el nombre con el getName
        System.out.println("Nombre del hilo: "+Thread.currentThread().getName()+" Estado: "+Thread.currentThread().getState());
        //Creamos un hilo
        MiHilo hilo1= new MiHilo();
        hilo1.start();
        MiHilo hilo2= new MiHilo();
        hilo2.start();
    }
}
class MiHilo extends Thread{ //La clase thread ya esta definida y pues lo de class MiHilo la hacemos nueva y ya
    @Override
    public void run(){
        //Aqui ponemos this.getName() por que thread ya esta definido en la clase thread
        System.out.println("Nombre del hilo: "+this.getName()+ " Estado: "+this.getState());
    }
}