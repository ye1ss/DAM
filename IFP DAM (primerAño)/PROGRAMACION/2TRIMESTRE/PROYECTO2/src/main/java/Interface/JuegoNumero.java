/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

/**
 *
 * @author Alumno
 */
import java.util.Scanner;

public class JuegoNumero implements Juego{
    private int numAdivina;
    private Scanner teclado;
    private int intentos;

public JuegoNumero(){
    teclado= new Scanner(System.in);
}
public void iniciar(){
    numAdivina= 1 +(int)(Math.random() *100);
}
public void jugar(){
int numero;
    do{
        System.out.print("Adivina el numero entre 1 y 100 : ");
        numero= teclado.nextInt();
        if(numAdivina <numero)
            System.out.println("El número a adivinar es menor");
        else if(numAdivina >numero)
            System.out.println("El número a adivinar es mayor");
        intentos++;
    }while(numero!=numAdivina);
}

public void finalizar(){
System.out.println("Ganaste luego de "+intentos+ "intentos");
}    
}