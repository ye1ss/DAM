/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.productorconsumidor;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alumno
 */
public class ProductorConsumidor {

    public static void main(String[] args)throws IOException {
        Cola cola= new Cola();
        Produce productor= new Produce(cola, 1);
        Consume consumidor= new Consume(cola, 1);
        
        productor.start();
        consumidor.start();
    }
}
class Produce extends Thread{
    private Cola cola;
    private int n;
    
    public Produce(Cola c, int n){
        cola=c;
        this.n=n;
    }
    @Override
    public void run(){
        for(int i=0; i<5; i++){
            cola.put(i);
            System.out.println("Productor: "+ n +" produce: "+i);
        }
        try{
            sleep(100);
        }catch(InterruptedException ex){
            ex.printStackTrace();
        }
    }
}
class Consume extends Thread{
    private Cola cola;
    private int n;
    
    public Consume(Cola c, int n){
        cola= c;
        this.n=n;
    }
    @Override
    public void run(){
        int valor= 0;
        for(int i=0; i<5; i++){
        valor= cola.get();
        System.out.println(i+"consumidor: "+n+" consume: "+valor);
    }
    }
}
//sin sincronizar

class Cola {

    private int numero;
    private boolean disponible = false;

    public synchronized int get() {
        while (!disponible) {
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Cola.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
            disponible = false;
            notify();
            return numero;    
        }    
    public synchronized void put(int valor){
 
            while(disponible){
                try{
                    wait();
                } catch(InterruptedException ex) {
                Logger.getLogger(Cola.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            disponible= true;
            numero= valor; 
            notify();

    }
}

//public void put(int valor){ ESTO IRIA SIN SINCRONIZAR
//            numero= valor;
//            disponible= true;
//        }

        