/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hilosConParametros;

/**
 *
 * @author yeism
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        proceso hilo1= new proceso(" Hilo 1");
        proceso hilo2= new proceso(" Hilo 2");
        proceso hilo3= new proceso(" Hilo 3");
        
        hilo1.numeroElegido(5);
        hilo2.numeroElegido(10);
        hilo3.numeroElegido(3);
        
        
        hilo1.start();
        
        try{
            hilo1.sleep(3000);
        }catch(InterruptedException ie){
            System.out.println("Error en el Hilo 1 "+ ie);
        }
        
        hilo2.start();
        hilo3.start();
        hilo2.stop(); //con esto lo mato yo mismo para que finalize
    }
    
}
