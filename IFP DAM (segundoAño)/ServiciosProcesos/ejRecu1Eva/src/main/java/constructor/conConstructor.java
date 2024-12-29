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
public class conConstructor {
    
    public conConstructor(){
        Scanner sc= new Scanner(System.in);
        String nombre;
        
        System.out.println("Cual es tu nombre? : ");
        nombre= sc.nextLine();
        System.out.println("Tu nombre es: " +nombre);
    }
    
}
