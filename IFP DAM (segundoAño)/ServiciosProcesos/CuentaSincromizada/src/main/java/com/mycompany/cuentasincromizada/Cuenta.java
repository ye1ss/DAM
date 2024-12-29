/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cuentasincromizada;

/**
 *
 * @author Alumno
 */
public class Cuenta {
    private int saldo;
    Cuenta(int s){
        saldo= s;
    }
    int getSaldo(){
        return saldo;
    }
    void restar (int cantidad){
        saldo= saldo-cantidad;
    }
    //void retirarDinero (int cantidad, String nombre){
        synchronized void retirarDinero (int cantidad, String nombre){
            if (getSaldo()>= cantidad){
                System.out.println(nombre+" va a retirar dinero.El saldo actual: "+getSaldo()); 
                try{
                    Thread.sleep(500);//Esto es para que en consola no salga de golpe e ir viendo como lo hace
                }
                catch(InterruptedException e){ }
                restar(cantidad);
                System.out.println(nombre+" retira: "+cantidad+" Saldo actual: "+getSaldo());
                    }
            else{
                System.out.println(nombre+" no puede retirar: "+cantidad+".Saldo insuficiente.");
            }
                if(getSaldo()<0){
                    System.out.println("Saldo narrativo: "+getSaldo());
                }

        }
}
