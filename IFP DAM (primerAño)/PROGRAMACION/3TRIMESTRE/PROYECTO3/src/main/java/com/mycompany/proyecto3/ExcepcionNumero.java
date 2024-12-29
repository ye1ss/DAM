/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.proyecto3;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class ExcepcionNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        Scanner sc= new Scanner(System.in);
        while(true){
            System.out.println("Introduce un número mayor que 30 ");
            try {
                num=sc.nextInt();
                if(num==0)break;
                else if (num > 0 && num <= 10){
                    throw new MiExcepcion(1);
                }else if (num > 10 && num <= 20){
                    throw new MiExcepcion(2);
                }else if (num > 20 && num <= 30){
                    throw new MiExcepcion(3);
                }
                }catch (MiExcepcion ex){
                        System.out.println(ex.getMessage());
                        }
            }
        }
}
            class MiExcepcion extends Exception{
                private int codigoError;
                public MiExcepcion(int codigoError){
                    super();
                    this.codigoError=codigoError;
                }
                @Override
                public String getMessage(){
                    String mensaje="";
                    switch(codigoError){
                        case 1:
                            mensaje="Error, el numero esta entre 1 y 10";
                        break;
                        case 2:
                            mensaje="Error, el numero esta entre 11 y 20";
                        break;
                        case 3:
                            mensaje="Error, el numero esta entre 21 y 30";
                        break;
                    }
                    return mensaje;
                }
            }

