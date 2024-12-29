/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package constructor;

import java.util.Scanner;

/**
 *
 * @author yeism
 */
public class sinConstructor {
    private Scanner sc= new Scanner(System.in);
    
    String nombre= " ";
    
    public void pedirNombre(){
        System.out.println("Cual es tu nombre: ");
        nombre= sc.nextLine();
    }
    
    public void imprimir(){
        System.out.println("Tu nombre es: "+ nombre);
    }
}
