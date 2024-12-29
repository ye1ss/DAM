/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cuentasincromizada;

/**
 *
 * @author Alumno
 */
public class SacarDinero extends Thread {
    private Cuenta cuenta;
    public SacarDinero(String n, Cuenta c){
        super(n);
        this.cuenta= c;
    }
    @Override
    public void run(){
        for(int i=1; i<=4;i++){
            cuenta.retirarDinero(40, getName());
            try{
                Thread.sleep(50);
            }
            catch(InterruptedException e){ }
        }
        cuenta.notify();
    }
    
}
