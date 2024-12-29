/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.centropadel;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alumno
 */

//al cliente le pongo yo aleatoriamente cuantas horas reserva

class GestorReservas{
    private static final int maxHorasDisponibles= 30;
    private List<Cliente> clientesEsperando= new ArrayList<>();
    private int horasDisponibles= maxHorasDisponibles;
    
    //devolver al monitor el primer cliente del array
    public void asignarCliente(){
        return ;
    }
    
    //resgistra la reserva que tiene el cliente asignado y descuenta las horas reservadas del total de horas
    //si quiere reservar 2h y solo queda 1h no se hace la reserva y se va
    
    public synchronized void atenderReserva(){
        if(!clientesEsperando.isEmpty()){
            Cliente cliente= clientesEsperando.remove(0);
//            if(cliente.getHorasDeseadas() <= horasDisponibles){
//                
//            }
        }
    }
    
}


class Monitor extends Thread{
    private GestorReservas gestor_reservas;
    
    public Monitor(String nombreHilo){
        super(nombreHilo);
    }
    
    
    public void run(){
        for(int i=0; i<=0; i++){
            System.out.println(this.getName());
//            try{
//                Monitor.sleep(3000);
//            }catch(InterruptedException ie){
//                System.out.println("Error dentro de la clase"+ ie);
//            }
        }
    }
    
}

class Cliente{
    
    private GestorReservas gestor_reservas;
    private int id;
    private int horasReservar= 1;

    public Cliente(GestorReservas gestor_reservas, int id) {
        this.gestor_reservas = gestor_reservas;
        this.id = id;
    }
    
    public int getId() {
        return id;
    }

    public int getHorasReservar() {
        return horasReservar;
    }
    
}

class SimuladorReservasPadel {
    
    
    public static void main(String[] args) {
        
        GestorReservas gestor_reservas= new GestorReservas();
        
        Monitor monitor1= new Monitor("Monitor 1");
        Monitor monitor2= new Monitor("Monitor 2");
        Monitor monitor3= new Monitor("Monitor 3");
        
        monitor1.start();
        try{
            monitor1.sleep(1000);
        }catch(InterruptedException ie){
            System.out.println("Error en el Hilo 1 "+ ie);
        }
        
        monitor2.start();
        try{
            monitor2.sleep(1000);
        }catch(InterruptedException ie){
            System.out.println("Error en el Hilo 1 "+ ie);
        }
        
        monitor3.start();
        try{
            monitor3.sleep(1000);
        }catch(InterruptedException ie){
            System.out.println("Error en el Hilo 1 "+ ie);
        }
        
        //crear clientes mediante un bucle
//        for (int i= 0; i <=i; i++){
//            System.out.print(i);
//            Cliente cliente1= new Cliente(i, 1);
//        }
        
    }

}
    