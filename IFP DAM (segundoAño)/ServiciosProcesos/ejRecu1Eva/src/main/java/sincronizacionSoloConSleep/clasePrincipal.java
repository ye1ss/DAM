/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sincronizacionSoloConSleep;

/**
 *
 * @author yeism
 */
public class clasePrincipal {
    public static void main(String[] args) {
        
        hilo1 hilo1= new hilo1();
        hilo2 hilo2= new hilo2();
        hilo3 hilo3= new hilo3();

        
        hilo1.start();
        try{
            hilo1.sleep(10);
        }catch(InterruptedException ie){
            System.out.println("Error en el hilo1 " +ie);
        }
        
        hilo2.start();   
        try{
            hilo2.sleep(10);
        }catch(InterruptedException ie){
            System.out.println("Error en el hilo2 " +ie);
        }
        
        hilo3.start();
        try{
            hilo3.sleep(10);
        }catch(InterruptedException ie){
            System.out.println("Error en el hilo3 " +ie);
        }
        
    }
}
