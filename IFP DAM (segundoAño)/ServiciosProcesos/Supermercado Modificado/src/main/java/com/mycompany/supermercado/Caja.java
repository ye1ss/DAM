/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.supermercado;

import java.util.Date;

/**
 *
 * @author yeismil del rosario
 */
public class Caja {
    
    private String nombreCaja;

    public Caja(String nombreCaja) {
        this.nombreCaja = nombreCaja;
    }
    
    public synchronized void procesarCompras(Date horaActual,Cliente clientes){

            System.out.println("Caja: "+ nombreCaja);
            String nombreCliente= clientes.getNombre();
            System.out.println("Nombre cliente: "+nombreCliente);
            System.out.println("Hora actual: " + horaActual);
                
            //Hacemos un for para que nos enseñe todos los productos
            System.out.println("Productos procesados: ");
                for (String producto : clientes.getCarroCompra()) {
                    System.out.println(producto);
                }
                //Para indicar el tiempo que ha tardado en procesar la compra
                try {
                        Thread.sleep(2000); //Esto lo simula 2 seg
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //Indica de que cliente es la compra procesada
                    System.out.println("Compra procesada para " + clientes.getNombre() + "\n");
        
    }
}
