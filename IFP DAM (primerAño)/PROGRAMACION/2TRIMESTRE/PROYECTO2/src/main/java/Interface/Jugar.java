/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Interface;

/**
 *
 * @author Alumno
 */
public class Jugar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//       JuegoNumero Juego2= new JuegoNumero();
//       Juego2.iniciar();
//       Juego2.jugar();
//       Juego2.finalizar();
        
       //Este es otro juago diferente  
       JuegoDados Juego1= new JuegoDados();
       Juego1.bienvenida();
       //Juego1.comienzo();
       Juego1.iniciar();
       //Juego1.proceso();
       Juego1.jugar();
       Juego1.finalizar();
       //Juego1.fin();
       Juego1.despedida();
       
       
    }
    
}
