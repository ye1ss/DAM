/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PrioridadesHilo;

/**
 *
 * @author Alumno
 */
public class PrioridadHilos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hilo hilo1= new Hilo("Hilo1");
        Hilo hilo2= new Hilo("Hilo2");
        Hilo hilo3= new Hilo("Hilo3");
        
        hilo1.setPriority(Thread.NORM_PRIORITY);//esto es lo mismo que ponerle 5 de prioridad
        hilo2.setPriority(Thread.MAX_PRIORITY);
        hilo3.setPriority(Thread.MIN_PRIORITY);
        
        hilo1.start();
        hilo2.start();
        hilo3.start();
        
        try{
            Thread.sleep(10000);
        }catch (Exception e){ }
        
        hilo1.paraHilo();
        hilo2.paraHilo();
        hilo3.paraHilo();
        System.out.println("Hilo2 con prioridad máxima: "+hilo2.getContador());
        System.out.println("Hilo1 con prioridad normal: "+hilo1.getContador());
        System.out.println("Hilo3 con prioridad mínima: "+hilo3.getContador());
    }
}

    class Hilo extends Thread{
    private int c= 0;
    private boolean stopHilo= false;
    
    public Hilo(String nombre){
        super(nombre);
    }

    public int getContador() {
        return c;
    }

    public void paraHilo(){
        stopHilo= true;
    }
    
    @Override
    public void run(){
        while (!stopHilo){
            try{
                Thread.sleep(2);
            }catch (Exception e){
            }
            c++;    
        }
    System.out.println("Fin del hilo "+ this.getName());
    this.interrupt();    
    }
}

