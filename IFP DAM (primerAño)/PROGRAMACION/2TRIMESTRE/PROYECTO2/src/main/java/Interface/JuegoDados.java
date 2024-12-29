/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */

public class JuegoDados extends Abstracta implements Juego{
    private int dado1, dado2;
    private String jugador1;
    private String jugador2;
    private Scanner teclado;

public JuegoDados(){
    teclado= new Scanner(System.in);
}
public void despedida(){
    System.out.println("Gracias por participar");
}
public void iniciar(){
    System.out.print("Ingrese el nombre del primer jugador: ");
    jugador1= teclado.next();
    System.out.print("Ingrese el nombre del segundo jugador: ");
    jugador2= teclado.next();
}
public void jugar(){
    dado1= 1+ (int)(Math.random()*6);
    dado2= 1+ (int)(Math.random()*6);
    System.out.println(jugador1+ " le ha salido el valor "+dado1);
    System.out.println(jugador2+ " le ha salido el valor "+dado2);
}
public void finalizar(){
    if(dado1>dado2)
        System.out.print(jugador1 +" ha ganado con un "+dado1);
    else if(dado2>dado1)
        System.out.print(jugador2 +" ha ganado con un "+dado2);        
    else
        System.out.print("Empataron los dos jugadores con un "+dado1+" y "+dado2);
}

//    @Override
//    public void comienzo() {
//       System.out.println("Comienza el juego");
//    }
//
//    @Override
//    public void proceso() {
//        System.out.println("Se lanzan los dados");
//    }
//
//    @Override
//    public void fin() {
//        System.out.println("Hasta la proxima");
//    }
}