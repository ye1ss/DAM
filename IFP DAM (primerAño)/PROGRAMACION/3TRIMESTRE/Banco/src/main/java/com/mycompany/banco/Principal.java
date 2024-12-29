/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.banco;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Alumno
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    
    static String[] menu={"CuentaNueva", "ListadoCuentas ", "MostrarCuenta ", "RealizarIngreso", "RetirarEfectivo", "ConsultarSaldo", "Salir"}; 
    public static void main(String[] args) {
      
        Scanner sc= new Scanner(System.in);   
        int opcion;
        boolean salir = false;
        while(true){
            opcion =JOptionPane.showOptionDialog(null, "BANCOYY", "Bancoyy.com", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, menu, menu[0]);        
            switch(opcion){
                case 1:
                    CuentaNueva();
                    break;
                
                case 2:
                    ListadoCuentas();
                    break;
                
                case 3:
                    MostrarCuenta();
                    break;
                    
                case 4:
                    RealizarIngreso();
                    break;
                    
                case 5:
                    RetirarEfectivo();
                    break;
                
                case 6:
                    ConsultarSaldo();
                    break;
                
                case 7:
                    Salir();
                    
                    break;
            }
        }
    }

    private static void CuentaNueva() {
       
    }

    private static void ListadoCuentas() {
        
    }

    private static void MostrarCuenta() {
        
    }

    private static void RealizarIngreso() {
        
    }

    private static void RetirarEfectivo() {
        
    }

    private static void ConsultarSaldo() {
        
    }

    private static void Salir() {
       salir= true;  
        
    }


    
}
