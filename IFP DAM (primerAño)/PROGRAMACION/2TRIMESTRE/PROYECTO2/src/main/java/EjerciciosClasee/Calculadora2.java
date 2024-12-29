/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjerciciosClasee;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Calculadora2 {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    double num1;
    double num2;
    char num3;
    
    System.out.println("Escribe auqui dos numeros");
    num1=sc.nextInt();
    num2=sc.nextInt();
    
    System.out.println("Elige que operación quieres hacer");
    num3=sc.next().charAt(0);
    
    double resultado;
    
    switch (num3){
        case '+':
            resultado=num1+num2;
            break;
        case '-':
            resultado=num1-num2;
            break;
        case '*':
            resultado=num1-num2;
            break;
        case '/':
            resultado=num1-num2;
            break;
        default:
            System.out.println("Operacion invalida");
            return;
    }
        System.out.println("El resultado es :"+ resultado);
}
    }