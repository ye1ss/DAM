/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejrecu1eva;

/**
 *
 * @author yeismil
 */
public class hilos extends Thread {
    
    @Override
    public void run(){
        for(int i= 0; i<=5; i++){
            System.out.println("Hilo 1");
        }
    }   
    public static void main(String[] args) {
        hilos hilo1= new hilos();
        hilo1.start();
    }
}
