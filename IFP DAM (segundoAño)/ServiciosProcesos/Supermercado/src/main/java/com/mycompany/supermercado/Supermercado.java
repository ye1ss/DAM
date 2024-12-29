/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.supermercado;

import java.util.Date;

/**
 *
 * @author yeismil del rosario
 */
public class Supermercado {
    //Hacer un hilo para cada caja registradora(osea lanzar solo dos hilos)
    //Crear clases cliente, caja, y la principal supermercado(esta)
    public static void main(String[] args) {
        
        //Cliente cliente = new Cliente("yeiss", new String[] { "Pan", "Jamón" });
        //System.out.println(cliente.toString());
        
        //Acemos el array de clientes
        Cliente[] clientes = new Cliente[5];
        
        //Creamos las cajas
        Caja caja1 = new Caja("Caja 1");
        Caja caja2 = new Caja("Caja 2");
        
        //Crear clientes y su carrito de la compra
        clientes[0] = new Cliente("Cliente 1", new String[]{"zumo", "manzana", "pollo"});
        clientes[1] = new Cliente("Cliente 2", new String[]{"carne", "pan"});
        clientes[2] = new Cliente("Cliente 3", new String[]{"papel", "escoba"});
        clientes[3] = new Cliente("Cliente 4", new String[]{"arroz", "lentejas"});
        clientes[4] = new Cliente("Cliente 5", new String[]{"pepsi", "salchicha"});
        
        //Establecer la hora actual
        Date horaActual = new Date();
        
        //Procesar la compra de 3 clientes en la caja1
        caja1.procesarCompras(horaActual, clientes[3], clientes[4], clientes[1]);

        //Procesar la compra de 2 clientes en la caja2
        caja2.procesarCompras(horaActual, clientes[2], clientes[0]);
        
        //Crear hilos para procesar las compras
        Thread hiloCaja1 = new Thread(() -> caja1.procesarCompras(horaActual,clientes[3], clientes[4], clientes[1]));
        Thread hiloCaja2 = new Thread(() -> caja2.procesarCompras(horaActual,clientes[2], clientes[0]));

        //Iniciar los hilos
        hiloCaja1.start();
        hiloCaja2.start();
        
        
    }
}
