/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.proyecto3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class ExcepcionNumerosYO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1;
        int num2;
        int num3;
        int num4;
        num1=leernumero();
        num2=leernumero();
        num3=leernumero();
        num4=leernumero();
        int resultado= num1+ num2+ num3+ num4;
        System.out.println("La suma de los numeros es: "+resultado);
        
        float division=(float)num3/num4;
        System.out.println("La division de los ultimos dos números es: "+division);
    }   
        public static int leernumero(){
        Scanner sc= new Scanner(System.in);
        int num1=0;
            while(true){
            System.out.println("Introduce 4 números");
            try{
                num1=sc.nextInt();
            }catch (InputMismatchException ex){
                System.out.println("Esto es una letra, escribe un número porfavor");
                sc.nextLine();
            }
                return num1;
            }
        }
}
//ESTA MAL TENGO QUE HACER QUE SIGA PIDIENDO NUMEROS EN CASO DE QUE HAYA LETRAS Y QUE NO DIVIDA Y VUELVA A PDIR EN CASO DE QUE DE 0.
        
//            System.out.println("Introduce el segundo número");
//            try{
//                num2=sc.nextInt();
//            }catch (InputMismatchException ex){
//                System.out.println("Esto es una letra, escribe un número porfavor");
//                sc.nextLine();
//            }
//            System.out.println("Introduce el tercer número");
//            try{
//                num3=sc.nextInt();
//            }catch (InputMismatchException ex){
//                System.out.println("Esto es una letra, escribe un número porfavor");
//                sc.nextLine();
//            }
//            System.out.println("Introduce el cuarto número");
//            try{
//                num4=sc.nextInt();
//            }catch (InputMismatchException ex){
//                System.out.println("Esto es una letra, escribe un número porfavor");
//                sc.nextLine();
//            } 
//                num1=sc.nextInt();
//                num2=sc.nextInt();
//                num3=sc.nextInt();
//                num4=sc.nextInt();
//                int resultado= num1+ num2+ num3+ num4;
//                System.out.println("La suma de los números es: " +resultado);
  

