/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.faunasalvaje;

/**
 *
 * @author Yeismil
 */
public class Mamiferos extends Animal{
    public boolean atropello;

    public Mamiferos(boolean atropello, String Nombre, String fechaEntrada, String especie, String tipoLesion, String gravedad, String peso) {
        super(Nombre, fechaEntrada, especie, tipoLesion, gravedad, peso);
        this.atropello = atropello;
    }

    public boolean isAtropello() {
        return atropello;
    }

    public void setAtropello(boolean atropello) {
        this.atropello = atropello;
    }
    
    
}
