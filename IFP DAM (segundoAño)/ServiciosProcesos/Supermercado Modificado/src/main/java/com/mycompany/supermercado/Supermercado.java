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
        
        //Acemos el arry de clientes
        Cliente[] clientes = new Cliente[5];
        
        //Creamos las cajas
        Caja caja1 = new Caja("Caja 1");
        
        //Crear clientes y su carrito de la compra
        clientes[0] = new Cliente("Cliente 1", new String[]{"zumo", "manzana", "pollo"});
        clientes[1] = new Cliente("Cliente 2", new String[]{"carne", "pan"});
        clientes[2] = new Cliente("Cliente 3", new String[]{"papel", "escoba"});
        clientes[3] = new Cliente("Cliente 4", new String[]{"arroz", "lentejas"});
        clientes[4] = new Cliente("Cliente 5", new String[]{"pepsi", "salchicha"});
        
        //Establecer la hora actual
        Date horaActual = new Date();
        
        for(Cliente C: clientes){
           //Crear hilos para procesar las compras
            Thread hiloCliente1 = new Thread(() -> caja1.procesarCompras(horaActual, C));
            hiloCliente1.start();
        }       
    }
}
