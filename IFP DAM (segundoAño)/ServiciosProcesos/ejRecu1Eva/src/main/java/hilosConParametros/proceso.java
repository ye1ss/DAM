/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hilosConParametros;

/**
 *
 * @author yeism
 */
public class proceso extends Thread{
    
    int num;
    
    //este public es para ponerle el nombre al hilo de como lo hemos llamado nosotros
    public proceso(String nombreHilo){
        super(nombreHilo);
    }
    
    @Override
    public void run(){
        for(int i= 0; i<= num; i++){
            System.out.println(i+ " " +this.getName());
            try{
                proceso.sleep(1000);
            }catch(InterruptedException ie){
                System.out.println("Error dentro de la clase"+ ie);
            }
            
        }
        System.out.println("");
    }
    
    public void numeroElegido(int valor){
        this.num= valor;
    }
}
