/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cuentasincromizada;

/**
 *
 * @author Alumno
 */
public class CuentaSincromizada {

    public static void main(String[] args) {
        //comparten cuenta
        Cuenta c= new Cuenta(40);
        SacarDinero h1= new SacarDinero("Ana", c);
        SacarDinero h2= new SacarDinero("Juan", c);
        
        h1.start();
        h2.start();
    }
}
